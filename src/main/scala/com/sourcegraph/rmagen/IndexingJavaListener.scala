package com.sourcegraph.rmagen

import org.antlr.v4.runtime.ParserRuleContext

class SimpleJavaListener() extends JavaBaseListener {

  val index: CodeIndex = new CodeIndex()

  private[this] def indexDeclaration(idName: String, typeString: String, ctx: ParserRuleContext): Unit = {
    index.addDeclaration(idName, typeString, ctx)
  }

  override def exitExpression(ctx: JavaParser.ExpressionContext) = {
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
