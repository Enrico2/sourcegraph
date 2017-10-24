package com.sourcegraph.rmagen

import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}

class CodeTools(code: String) {
  val in = new ANTLRInputStream(code)
  val l = new JavaLexer(in)
  val stream = new CommonTokenStream(l)
  val p = new JavaParser(stream)

  val root = p.compilationUnit()
  val listener = new IndexingJavaListener()
  ParseTreeWalker.DEFAULT.walk(listener, root)
  val index = listener.index

  // Terribly inefficient
  private[this] def getWordAtLocation(location: Location): String = {
    var done = false
    var start = location.start
    var end = location.end

    while (!done) {
      val isValidStart = Character.isJavaIdentifierStart(code.charAt(start)) && Character.isJavaIdentifierPart(code.charAt(start))
      val isValidEnd = Character.isJavaIdentifierPart(code.charAt(end))

      if (isValidStart) start -= 1
      if (isValidEnd) end += 1

      if (!isValidStart && !isValidEnd) {
        start += 1
        done = true
      }
    }

    code.substring(start, end)
  }

  def jumpToDef(location: Location): Location = {
    val word = getWordAtLocation(location)
    index.getDeclaration(word, location)
  }

  def tooltip(location: Location): String = {
    jumpToDef(location) match {
      case NoLocation => "Nothing to show"
      case loc => code.substring(loc.start, loc.end + 1)
    }
  }

  def references(location: Location): Seq[Location] = {
    val word = getWordAtLocation(location)
    index.getReferences(word)
  }
}