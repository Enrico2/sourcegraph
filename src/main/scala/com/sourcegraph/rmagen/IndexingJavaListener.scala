package com.sourcegraph.rmagen

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ErrorNode

class IndexingJavaListener() extends JavaBaseListener {

  val index: CodeIndex = new CodeIndex()

  private[this] def indexDeclaration(idName: String, typeString: String, ctx: ParserRuleContext): Unit = {
    index.addDeclaration(idName, typeString, ctx)
  }

  override def visitErrorNode(node: ErrorNode) = {
    sys.error(s"Visiting an ErrorNode: $node")
  }

  // On exit, so that in most cases we will have already indexed the declaration.
  override def exitExpression(ctx: JavaParser.ExpressionContext) = {
    // Ideally, I'd like a better hook for finding "real" identifiers. Currently it's an optimistic implementation
    // where any expression that's a valid identifier is considered as such.
    index.maybeAddRef(ctx)
  }

  override def enterFieldDeclaration(ctx: JavaParser.FieldDeclarationContext) = {
    val v = ctx.variableDeclarators().variableDeclarator().get(0).variableDeclaratorId().getText
    val t = ctx.typeType().getText

    indexDeclaration(v, t, ctx)
  }

  override def enterFormalParameter(ctx: JavaParser.FormalParameterContext) = {
    val v = ctx.variableDeclaratorId().getText
    val t = ctx.typeType().getText
    indexDeclaration(v, t, ctx)
  }


  override def enterLocalVariableDeclaration(ctx: JavaParser.LocalVariableDeclarationContext) = {
    val v = ctx.variableDeclarators().variableDeclarator().get(0).variableDeclaratorId().getText
    val t = ctx.typeType().getText
    indexDeclaration(v, t, ctx)
  }

  override def enterMethodDeclaration(ctx: JavaParser.MethodDeclarationContext) = {
    val m = ctx.Identifier().getText
    val t = ctx.children.get(0).getText
    indexDeclaration(m, t, ctx)
  }
}
