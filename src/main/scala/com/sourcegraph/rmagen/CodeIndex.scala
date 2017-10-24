package com.sourcegraph.rmagen

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.{ParseTree, TerminalNode}
import scala.collection.JavaConverters._
import scala.collection.mutable


class CodeIndex() {
  private[this] val declarations = mutable.Map[String, mutable.ListBuffer[Declaration]]()
  private[this] val references = mutable.Map[String, mutable.ListBuffer[Location]]()
  private[this] def refs(idName: String) =
    references.getOrElseUpdate(idName, mutable.ListBuffer[Location]())

  private[this] def find(str: String, t: ParseTree): Option[ParseTree] = {
    if (t.getChildCount == 0) {
      None
    } else if (t.getText == str) {
      Some(t)
    } else {
      (0 until t.getChildCount).map(t.getChild(_)).foldLeft[Option[ParseTree]](None) { (rep, child) =>
        if (rep.nonEmpty) rep else find(str, child)
      }
    }
  }

  def getDeclaration(idName: String, location: Location): Location = {
    declarations.get(idName).map { declarations =>
      val ctx = if (declarations.size == 1) {
        declarations.head.ctx
      } else {
        declarations.filter { d => location.containedBy(d.ctx) }.head.ctx
      }
      RangeLocation(ctx.start.getStartIndex, ctx.stop.getStopIndex)
    }.getOrElse(NoLocation)
  }

  def addDeclaration(idName: String, typeString: String, ctx: ParserRuleContext): Unit = {
    val list = declarations.getOrElseUpdate(idName, mutable.ListBuffer[Declaration]())
    val refList = refs(idName)

    if (!list.exists { d => d.ctx == ctx }) {
      // println(s"adding declaration $typeString $idName")

      list.append(Declaration(idName, typeString, ctx))

      ctx.children.asScala.foreach {
        case child: ParserRuleContext if child.getText == idName =>
          refList.append(RangeLocation(child.start.getStartIndex, child.stop.getStopIndex))
        case child: TerminalNode if child.getText == idName =>
          val token = child.getSymbol
          refList.append(RangeLocation(token.getStartIndex, token.getStopIndex))
        case _ =>
          ()
      }
    }
  }

  def maybeAddRef(ctx: ParserRuleContext): Unit = {
    val idName = ctx.getText

    // This is hacky af
    if (isValidJavaIdentifier(idName)) {
      val list = refs(idName)
      val location = RangeLocation(ctx.start.getStartIndex, ctx.stop.getStopIndex)

      // println(s"adding usage for $idName in $location")
      list.append(location)
    }
  }

  def getReferences(idName: String): Seq[Location] = references.getOrElse(idName, Nil)

  private[this] def isValidJavaIdentifier(idName: String): Boolean = {
    if (idName == null || idName.trim.isEmpty) {
      false
    } else {
      Character.isJavaIdentifierStart(idName.charAt(0)) &&
        idName.substring(1).toCharArray.forall { c => Character.isJavaIdentifierPart(c) }
    }
  }
}


case class Declaration(varName: String, typeString: String, ctx: ParserRuleContext)

