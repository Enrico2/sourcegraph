package com.sourcegraph.rmagen

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.{ErrorNode, TerminalNode}

class PrintingJavaListener extends JavaBaseListener {
  override def enterCompilationUnit(ctx: JavaParser.CompilationUnitContext) = println(s"enterCompilationUnit: ${ctx.getText()}")

  override def exitCompilationUnit(ctx: JavaParser.CompilationUnitContext) = println(s"exitCompilationUnit: ${ctx.getText()}")

  override def enterPackageDeclaration(ctx: JavaParser.PackageDeclarationContext) = println(s"enterPackageDeclaration: ${ctx.getText()}")

  override def exitPackageDeclaration(ctx: JavaParser.PackageDeclarationContext) = println(s"exitPackageDeclaration: ${ctx.getText()}")

  override def enterImportDeclaration(ctx: JavaParser.ImportDeclarationContext) = println(s"enterImportDeclaration: ${ctx.getText()}")

  override def exitImportDeclaration(ctx: JavaParser.ImportDeclarationContext) = println(s"exitImportDeclaration: ${ctx.getText()}")

  override def enterTypeDeclaration(ctx: JavaParser.TypeDeclarationContext) = println(s"enterTypeDeclaration: ${ctx.getText()}")

  override def exitTypeDeclaration(ctx: JavaParser.TypeDeclarationContext) = println(s"exitTypeDeclaration: ${ctx.getText()}")

  override def enterModifier(ctx: JavaParser.ModifierContext) = println(s"enterModifier: ${ctx.getText()}")

  override def exitModifier(ctx: JavaParser.ModifierContext) = println(s"exitModifier: ${ctx.getText()}")

  override def enterClassOrInterfaceModifier(ctx: JavaParser.ClassOrInterfaceModifierContext) = println(s"enterClassOrInterfaceModifier: ${ctx.getText()}")

  override def exitClassOrInterfaceModifier(ctx: JavaParser.ClassOrInterfaceModifierContext) = println(s"exitClassOrInterfaceModifier: ${ctx.getText()}")

  override def enterVariableModifier(ctx: JavaParser.VariableModifierContext) = println(s"enterVariableModifier: ${ctx.getText()}")

  override def exitVariableModifier(ctx: JavaParser.VariableModifierContext) = println(s"exitVariableModifier: ${ctx.getText()}")

  override def enterClassDeclaration(ctx: JavaParser.ClassDeclarationContext) = println(s"enterClassDeclaration: ${ctx.getText()}")

  override def exitClassDeclaration(ctx: JavaParser.ClassDeclarationContext) = println(s"exitClassDeclaration: ${ctx.getText()}")

  override def enterTypeParameters(ctx: JavaParser.TypeParametersContext) = println(s"enterTypeParameters: ${ctx.getText()}")

  override def exitTypeParameters(ctx: JavaParser.TypeParametersContext) = println(s"exitTypeParameters: ${ctx.getText()}")

  override def enterTypeParameter(ctx: JavaParser.TypeParameterContext) = println(s"enterTypeParameter: ${ctx.getText()}")

  override def exitTypeParameter(ctx: JavaParser.TypeParameterContext) = println(s"exitTypeParameter: ${ctx.getText()}")

  override def enterTypeBound(ctx: JavaParser.TypeBoundContext) = println(s"enterTypeBound: ${ctx.getText()}")

  override def exitTypeBound(ctx: JavaParser.TypeBoundContext) = println(s"exitTypeBound: ${ctx.getText()}")

  override def enterEnumDeclaration(ctx: JavaParser.EnumDeclarationContext) = println(s"enterEnumDeclaration: ${ctx.getText()}")

  override def exitEnumDeclaration(ctx: JavaParser.EnumDeclarationContext) = println(s"exitEnumDeclaration: ${ctx.getText()}")

  override def enterEnumConstants(ctx: JavaParser.EnumConstantsContext) = println(s"enterEnumConstants: ${ctx.getText()}")

  override def exitEnumConstants(ctx: JavaParser.EnumConstantsContext) = println(s"exitEnumConstants: ${ctx.getText()}")

  override def enterEnumConstant(ctx: JavaParser.EnumConstantContext) = println(s"enterEnumConstant: ${ctx.getText()}")

  override def exitEnumConstant(ctx: JavaParser.EnumConstantContext) = println(s"exitEnumConstant: ${ctx.getText()}")

  override def enterEnumBodyDeclarations(ctx: JavaParser.EnumBodyDeclarationsContext) = println(s"enterEnumBodyDeclarations: ${ctx.getText()}")

  override def exitEnumBodyDeclarations(ctx: JavaParser.EnumBodyDeclarationsContext) = println(s"exitEnumBodyDeclarations: ${ctx.getText()}")

  override def enterInterfaceDeclaration(ctx: JavaParser.InterfaceDeclarationContext) = println(s"enterInterfaceDeclaration: ${ctx.getText()}")

  override def exitInterfaceDeclaration(ctx: JavaParser.InterfaceDeclarationContext) = println(s"exitInterfaceDeclaration: ${ctx.getText()}")

  override def enterTypeList(ctx: JavaParser.TypeListContext) = println(s"enterTypeList: ${ctx.getText()}")

  override def exitTypeList(ctx: JavaParser.TypeListContext) = println(s"exitTypeList: ${ctx.getText()}")

  override def enterClassBody(ctx: JavaParser.ClassBodyContext) = println(s"enterClassBody: ${ctx.getText()}")

  override def exitClassBody(ctx: JavaParser.ClassBodyContext) = println(s"exitClassBody: ${ctx.getText()}")

  override def enterInterfaceBody(ctx: JavaParser.InterfaceBodyContext) = println(s"enterInterfaceBody: ${ctx.getText()}")

  override def exitInterfaceBody(ctx: JavaParser.InterfaceBodyContext) = println(s"exitInterfaceBody: ${ctx.getText()}")

  override def enterClassBodyDeclaration(ctx: JavaParser.ClassBodyDeclarationContext) = println(s"enterClassBodyDeclaration: ${ctx.getText()}")

  override def exitClassBodyDeclaration(ctx: JavaParser.ClassBodyDeclarationContext) = println(s"exitClassBodyDeclaration: ${ctx.getText()}")

  override def enterMemberDeclaration(ctx: JavaParser.MemberDeclarationContext) = println(s"enterMemberDeclaration: ${ctx.getText()}")

  override def exitMemberDeclaration(ctx: JavaParser.MemberDeclarationContext) = println(s"exitMemberDeclaration: ${ctx.getText()}")

  override def enterMethodDeclaration(ctx: JavaParser.MethodDeclarationContext) = println(s"enterMethodDeclaration: ${ctx.getText()}")

  override def exitMethodDeclaration(ctx: JavaParser.MethodDeclarationContext) = println(s"exitMethodDeclaration: ${ctx.getText()}")

  override def enterGenericMethodDeclaration(ctx: JavaParser.GenericMethodDeclarationContext) = println(s"enterGenericMethodDeclaration: ${ctx.getText()}")

  override def exitGenericMethodDeclaration(ctx: JavaParser.GenericMethodDeclarationContext) = println(s"exitGenericMethodDeclaration: ${ctx.getText()}")

  override def enterConstructorDeclaration(ctx: JavaParser.ConstructorDeclarationContext) = println(s"enterConstructorDeclaration: ${ctx.getText()}")

  override def exitConstructorDeclaration(ctx: JavaParser.ConstructorDeclarationContext) = println(s"exitConstructorDeclaration: ${ctx.getText()}")

  override def enterGenericConstructorDeclaration(ctx: JavaParser.GenericConstructorDeclarationContext) = println(s"enterGenericConstructorDeclaration: ${ctx.getText()}")

  override def exitGenericConstructorDeclaration(ctx: JavaParser.GenericConstructorDeclarationContext) = println(s"exitGenericConstructorDeclaration: ${ctx.getText()}")

  override def enterFieldDeclaration(ctx: JavaParser.FieldDeclarationContext) = println(s"enterFieldDeclaration: ${ctx.getText()}")

  override def exitFieldDeclaration(ctx: JavaParser.FieldDeclarationContext) = println(s"exitFieldDeclaration: ${ctx.getText()}")

  override def enterInterfaceBodyDeclaration(ctx: JavaParser.InterfaceBodyDeclarationContext) = println(s"enterInterfaceBodyDeclaration: ${ctx.getText()}")

  override def exitInterfaceBodyDeclaration(ctx: JavaParser.InterfaceBodyDeclarationContext) = println(s"exitInterfaceBodyDeclaration: ${ctx.getText()}")

  override def enterInterfaceMemberDeclaration(ctx: JavaParser.InterfaceMemberDeclarationContext) = println(s"enterInterfaceMemberDeclaration: ${ctx.getText()}")

  override def exitInterfaceMemberDeclaration(ctx: JavaParser.InterfaceMemberDeclarationContext) = println(s"exitInterfaceMemberDeclaration: ${ctx.getText()}")

  override def enterConstDeclaration(ctx: JavaParser.ConstDeclarationContext) = println(s"enterConstDeclaration: ${ctx.getText()}")

  override def exitConstDeclaration(ctx: JavaParser.ConstDeclarationContext) = println(s"exitConstDeclaration: ${ctx.getText()}")

  override def enterConstantDeclarator(ctx: JavaParser.ConstantDeclaratorContext) = println(s"enterConstantDeclarator: ${ctx.getText()}")

  override def exitConstantDeclarator(ctx: JavaParser.ConstantDeclaratorContext) = println(s"exitConstantDeclarator: ${ctx.getText()}")

  override def enterInterfaceMethodDeclaration(ctx: JavaParser.InterfaceMethodDeclarationContext) = println(s"enterInterfaceMethodDeclaration: ${ctx.getText()}")

  override def exitInterfaceMethodDeclaration(ctx: JavaParser.InterfaceMethodDeclarationContext) = println(s"exitInterfaceMethodDeclaration: ${ctx.getText()}")

  override def enterGenericInterfaceMethodDeclaration(ctx: JavaParser.GenericInterfaceMethodDeclarationContext) = println(s"enterGenericInterfaceMethodDeclaration: ${ctx.getText()}")

  override def exitGenericInterfaceMethodDeclaration(ctx: JavaParser.GenericInterfaceMethodDeclarationContext) = println(s"exitGenericInterfaceMethodDeclaration: ${ctx.getText()}")

  override def enterVariableDeclarators(ctx: JavaParser.VariableDeclaratorsContext) = println(s"enterVariableDeclarators: ${ctx.getText()}")

  override def exitVariableDeclarators(ctx: JavaParser.VariableDeclaratorsContext) = println(s"exitVariableDeclarators: ${ctx.getText()}")

  override def enterVariableDeclarator(ctx: JavaParser.VariableDeclaratorContext) = println(s"enterVariableDeclarator: ${ctx.getText()}")

  override def exitVariableDeclarator(ctx: JavaParser.VariableDeclaratorContext) = println(s"exitVariableDeclarator: ${ctx.getText()}")

  override def enterVariableDeclaratorId(ctx: JavaParser.VariableDeclaratorIdContext) = println(s"enterVariableDeclaratorId: ${ctx.getText()}")

  override def exitVariableDeclaratorId(ctx: JavaParser.VariableDeclaratorIdContext) = println(s"exitVariableDeclaratorId: ${ctx.getText()}")

  override def enterVariableInitializer(ctx: JavaParser.VariableInitializerContext) = println(s"enterVariableInitializer: ${ctx.getText()}")

  override def exitVariableInitializer(ctx: JavaParser.VariableInitializerContext) = println(s"exitVariableInitializer: ${ctx.getText()}")

  override def enterArrayInitializer(ctx: JavaParser.ArrayInitializerContext) = println(s"enterArrayInitializer: ${ctx.getText()}")

  override def exitArrayInitializer(ctx: JavaParser.ArrayInitializerContext) = println(s"exitArrayInitializer: ${ctx.getText()}")

  override def enterEnumConstantName(ctx: JavaParser.EnumConstantNameContext) = println(s"enterEnumConstantName: ${ctx.getText()}")

  override def exitEnumConstantName(ctx: JavaParser.EnumConstantNameContext) = println(s"exitEnumConstantName: ${ctx.getText()}")

  override def enterTypeType(ctx: JavaParser.TypeTypeContext) = println(s"enterTypeType: ${ctx.getText()}")

  override def exitTypeType(ctx: JavaParser.TypeTypeContext) = println(s"exitTypeType: ${ctx.getText()}")

  override def enterClassOrInterfaceType(ctx: JavaParser.ClassOrInterfaceTypeContext) = println(s"enterClassOrInterfaceType: ${ctx.getText()}")

  override def exitClassOrInterfaceType(ctx: JavaParser.ClassOrInterfaceTypeContext) = println(s"exitClassOrInterfaceType: ${ctx.getText()}")

  override def enterPrimitiveType(ctx: JavaParser.PrimitiveTypeContext) = println(s"enterPrimitiveType: ${ctx.getText()}")

  override def exitPrimitiveType(ctx: JavaParser.PrimitiveTypeContext) = println(s"exitPrimitiveType: ${ctx.getText()}")

  override def enterTypeArguments(ctx: JavaParser.TypeArgumentsContext) = println(s"enterTypeArguments: ${ctx.getText()}")

  override def exitTypeArguments(ctx: JavaParser.TypeArgumentsContext) = println(s"exitTypeArguments: ${ctx.getText()}")

  override def enterTypeArgument(ctx: JavaParser.TypeArgumentContext) = println(s"enterTypeArgument: ${ctx.getText()}")

  override def exitTypeArgument(ctx: JavaParser.TypeArgumentContext) = println(s"exitTypeArgument: ${ctx.getText()}")

  override def enterQualifiedNameList(ctx: JavaParser.QualifiedNameListContext) = println(s"enterQualifiedNameList: ${ctx.getText()}")

  override def exitQualifiedNameList(ctx: JavaParser.QualifiedNameListContext) = println(s"exitQualifiedNameList: ${ctx.getText()}")

  override def enterFormalParameters(ctx: JavaParser.FormalParametersContext) = println(s"enterFormalParameters: ${ctx.getText()}")

  override def exitFormalParameters(ctx: JavaParser.FormalParametersContext) = println(s"exitFormalParameters: ${ctx.getText()}")

  override def enterFormalParameterList(ctx: JavaParser.FormalParameterListContext) = println(s"enterFormalParameterList: ${ctx.getText()}")

  override def exitFormalParameterList(ctx: JavaParser.FormalParameterListContext) = println(s"exitFormalParameterList: ${ctx.getText()}")

  override def enterFormalParameter(ctx: JavaParser.FormalParameterContext) = println(s"enterFormalParameter: ${ctx.getText()}")

  override def exitFormalParameter(ctx: JavaParser.FormalParameterContext) = println(s"exitFormalParameter: ${ctx.getText()}")

  override def enterLastFormalParameter(ctx: JavaParser.LastFormalParameterContext) = println(s"enterLastFormalParameter: ${ctx.getText()}")

  override def exitLastFormalParameter(ctx: JavaParser.LastFormalParameterContext) = println(s"exitLastFormalParameter: ${ctx.getText()}")

  override def enterMethodBody(ctx: JavaParser.MethodBodyContext) = println(s"enterMethodBody: ${ctx.getText()}")

  override def exitMethodBody(ctx: JavaParser.MethodBodyContext) = println(s"exitMethodBody: ${ctx.getText()}")

  override def enterConstructorBody(ctx: JavaParser.ConstructorBodyContext) = println(s"enterConstructorBody: ${ctx.getText()}")

  override def exitConstructorBody(ctx: JavaParser.ConstructorBodyContext) = println(s"exitConstructorBody: ${ctx.getText()}")

  override def enterQualifiedName(ctx: JavaParser.QualifiedNameContext) = println(s"enterQualifiedName: ${ctx.getText()}")

  override def exitQualifiedName(ctx: JavaParser.QualifiedNameContext) = println(s"exitQualifiedName: ${ctx.getText()}")

  override def enterLiteral(ctx: JavaParser.LiteralContext) = println(s"enterLiteral: ${ctx.getText()}")

  override def exitLiteral(ctx: JavaParser.LiteralContext) = println(s"exitLiteral: ${ctx.getText()}")

  override def enterAnnotation(ctx: JavaParser.AnnotationContext) = println(s"enterAnnotation: ${ctx.getText()}")

  override def exitAnnotation(ctx: JavaParser.AnnotationContext) = println(s"exitAnnotation: ${ctx.getText()}")

  override def enterAnnotationName(ctx: JavaParser.AnnotationNameContext) = println(s"enterAnnotationName: ${ctx.getText()}")

  override def exitAnnotationName(ctx: JavaParser.AnnotationNameContext) = println(s"exitAnnotationName: ${ctx.getText()}")

  override def enterElementValuePairs(ctx: JavaParser.ElementValuePairsContext) = println(s"enterElementValuePairs: ${ctx.getText()}")

  override def exitElementValuePairs(ctx: JavaParser.ElementValuePairsContext) = println(s"exitElementValuePairs: ${ctx.getText()}")

  override def enterElementValuePair(ctx: JavaParser.ElementValuePairContext) = println(s"enterElementValuePair: ${ctx.getText()}")

  override def exitElementValuePair(ctx: JavaParser.ElementValuePairContext) = println(s"exitElementValuePair: ${ctx.getText()}")

  override def enterElementValue(ctx: JavaParser.ElementValueContext) = println(s"enterElementValue: ${ctx.getText()}")

  override def exitElementValue(ctx: JavaParser.ElementValueContext) = println(s"exitElementValue: ${ctx.getText()}")

  override def enterElementValueArrayInitializer(ctx: JavaParser.ElementValueArrayInitializerContext) = println(s"enterElementValueArrayInitializer: ${ctx.getText()}")

  override def exitElementValueArrayInitializer(ctx: JavaParser.ElementValueArrayInitializerContext) = println(s"exitElementValueArrayInitializer: ${ctx.getText()}")

  override def enterAnnotationTypeDeclaration(ctx: JavaParser.AnnotationTypeDeclarationContext) = println(s"enterAnnotationTypeDeclaration: ${ctx.getText()}")

  override def exitAnnotationTypeDeclaration(ctx: JavaParser.AnnotationTypeDeclarationContext) = println(s"exitAnnotationTypeDeclaration: ${ctx.getText()}")

  override def enterAnnotationTypeBody(ctx: JavaParser.AnnotationTypeBodyContext) = println(s"enterAnnotationTypeBody: ${ctx.getText()}")

  override def exitAnnotationTypeBody(ctx: JavaParser.AnnotationTypeBodyContext) = println(s"exitAnnotationTypeBody: ${ctx.getText()}")

  override def enterAnnotationTypeElementDeclaration(ctx: JavaParser.AnnotationTypeElementDeclarationContext) = println(s"enterAnnotationTypeElementDeclaration: ${ctx.getText()}")

  override def exitAnnotationTypeElementDeclaration(ctx: JavaParser.AnnotationTypeElementDeclarationContext) = println(s"exitAnnotationTypeElementDeclaration: ${ctx.getText()}")

  override def enterAnnotationTypeElementRest(ctx: JavaParser.AnnotationTypeElementRestContext) = println(s"enterAnnotationTypeElementRest: ${ctx.getText()}")

  override def exitAnnotationTypeElementRest(ctx: JavaParser.AnnotationTypeElementRestContext) = println(s"exitAnnotationTypeElementRest: ${ctx.getText()}")

  override def enterAnnotationMethodOrConstantRest(ctx: JavaParser.AnnotationMethodOrConstantRestContext) = println(s"enterAnnotationMethodOrConstantRest: ${ctx.getText()}")

  override def exitAnnotationMethodOrConstantRest(ctx: JavaParser.AnnotationMethodOrConstantRestContext) = println(s"exitAnnotationMethodOrConstantRest: ${ctx.getText()}")

  override def enterAnnotationMethodRest(ctx: JavaParser.AnnotationMethodRestContext) = println(s"enterAnnotationMethodRest: ${ctx.getText()}")

  override def exitAnnotationMethodRest(ctx: JavaParser.AnnotationMethodRestContext) = println(s"exitAnnotationMethodRest: ${ctx.getText()}")

  override def enterAnnotationConstantRest(ctx: JavaParser.AnnotationConstantRestContext) = println(s"enterAnnotationConstantRest: ${ctx.getText()}")

  override def exitAnnotationConstantRest(ctx: JavaParser.AnnotationConstantRestContext) = println(s"exitAnnotationConstantRest: ${ctx.getText()}")

  override def enterDefaultValue(ctx: JavaParser.DefaultValueContext) = println(s"enterDefaultValue: ${ctx.getText()}")

  override def exitDefaultValue(ctx: JavaParser.DefaultValueContext) = println(s"exitDefaultValue: ${ctx.getText()}")

  override def enterBlock(ctx: JavaParser.BlockContext) = println(s"enterBlock: ${ctx.getText()}")

  override def exitBlock(ctx: JavaParser.BlockContext) = println(s"exitBlock: ${ctx.getText()}")

  override def enterBlockStatement(ctx: JavaParser.BlockStatementContext) = println(s"enterBlockStatement: ${ctx.getText()}")

  override def exitBlockStatement(ctx: JavaParser.BlockStatementContext) = println(s"exitBlockStatement: ${ctx.getText()}")

  override def enterLocalVariableDeclarationStatement(ctx: JavaParser.LocalVariableDeclarationStatementContext) = println(s"enterLocalVariableDeclarationStatement: ${ctx.getText()}")

  override def exitLocalVariableDeclarationStatement(ctx: JavaParser.LocalVariableDeclarationStatementContext) = println(s"exitLocalVariableDeclarationStatement: ${ctx.getText()}")

  override def enterLocalVariableDeclaration(ctx: JavaParser.LocalVariableDeclarationContext) = println(s"enterLocalVariableDeclaration: ${ctx.getText()}")

  override def exitLocalVariableDeclaration(ctx: JavaParser.LocalVariableDeclarationContext) = println(s"exitLocalVariableDeclaration: ${ctx.getText()}")

  override def enterStatement(ctx: JavaParser.StatementContext) = println(s"enterStatement: ${ctx.getText()}")

  override def exitStatement(ctx: JavaParser.StatementContext) = println(s"exitStatement: ${ctx.getText()}")

  override def enterCatchClause(ctx: JavaParser.CatchClauseContext) = println(s"enterCatchClause: ${ctx.getText()}")

  override def exitCatchClause(ctx: JavaParser.CatchClauseContext) = println(s"exitCatchClause: ${ctx.getText()}")

  override def enterCatchType(ctx: JavaParser.CatchTypeContext) = println(s"enterCatchType: ${ctx.getText()}")

  override def exitCatchType(ctx: JavaParser.CatchTypeContext) = println(s"exitCatchType: ${ctx.getText()}")

  override def enterFinallyBlock(ctx: JavaParser.FinallyBlockContext) = println(s"enterFinallyBlock: ${ctx.getText()}")

  override def exitFinallyBlock(ctx: JavaParser.FinallyBlockContext) = println(s"exitFinallyBlock: ${ctx.getText()}")

  override def enterResourceSpecification(ctx: JavaParser.ResourceSpecificationContext) = println(s"enterResourceSpecification: ${ctx.getText()}")

  override def exitResourceSpecification(ctx: JavaParser.ResourceSpecificationContext) = println(s"exitResourceSpecification: ${ctx.getText()}")

  override def enterResources(ctx: JavaParser.ResourcesContext) = println(s"enterResources: ${ctx.getText()}")

  override def exitResources(ctx: JavaParser.ResourcesContext) = println(s"exitResources: ${ctx.getText()}")

  override def enterResource(ctx: JavaParser.ResourceContext) = println(s"enterResource: ${ctx.getText()}")

  override def exitResource(ctx: JavaParser.ResourceContext) = println(s"exitResource: ${ctx.getText()}")

  override def enterSwitchBlockStatementGroup(ctx: JavaParser.SwitchBlockStatementGroupContext) = println(s"enterSwitchBlockStatementGroup: ${ctx.getText()}")

  override def exitSwitchBlockStatementGroup(ctx: JavaParser.SwitchBlockStatementGroupContext) = println(s"exitSwitchBlockStatementGroup: ${ctx.getText()}")

  override def enterSwitchLabel(ctx: JavaParser.SwitchLabelContext) = println(s"enterSwitchLabel: ${ctx.getText()}")

  override def exitSwitchLabel(ctx: JavaParser.SwitchLabelContext) = println(s"exitSwitchLabel: ${ctx.getText()}")

  override def enterForControl(ctx: JavaParser.ForControlContext) = println(s"enterForControl: ${ctx.getText()}")

  override def exitForControl(ctx: JavaParser.ForControlContext) = println(s"exitForControl: ${ctx.getText()}")

  override def enterForInit(ctx: JavaParser.ForInitContext) = println(s"enterForInit: ${ctx.getText()}")

  override def exitForInit(ctx: JavaParser.ForInitContext) = println(s"exitForInit: ${ctx.getText()}")

  override def enterEnhancedForControl(ctx: JavaParser.EnhancedForControlContext) = println(s"enterEnhancedForControl: ${ctx.getText()}")

  override def exitEnhancedForControl(ctx: JavaParser.EnhancedForControlContext) = println(s"exitEnhancedForControl: ${ctx.getText()}")

  override def enterForUpdate(ctx: JavaParser.ForUpdateContext) = println(s"enterForUpdate: ${ctx.getText()}")

  override def exitForUpdate(ctx: JavaParser.ForUpdateContext) = println(s"exitForUpdate: ${ctx.getText()}")

  override def enterParExpression(ctx: JavaParser.ParExpressionContext) = println(s"enterParExpression: ${ctx.getText()}")

  override def exitParExpression(ctx: JavaParser.ParExpressionContext) = println(s"exitParExpression: ${ctx.getText()}")

  override def enterExpressionList(ctx: JavaParser.ExpressionListContext) = println(s"enterExpressionList: ${ctx.getText()}")

  override def exitExpressionList(ctx: JavaParser.ExpressionListContext) = println(s"exitExpressionList: ${ctx.getText()}")

  override def enterStatementExpression(ctx: JavaParser.StatementExpressionContext) = println(s"enterStatementExpression: ${ctx.getText()}")

  override def exitStatementExpression(ctx: JavaParser.StatementExpressionContext) = println(s"exitStatementExpression: ${ctx.getText()}")

  override def enterConstantExpression(ctx: JavaParser.ConstantExpressionContext) = println(s"enterConstantExpression: ${ctx.getText()}")

  override def exitConstantExpression(ctx: JavaParser.ConstantExpressionContext) = println(s"exitConstantExpression: ${ctx.getText()}")

  override def enterExpression(ctx: JavaParser.ExpressionContext) = println(s"enterExpression: ${ctx.getText()}")

  override def exitExpression(ctx: JavaParser.ExpressionContext) = println(s"exitExpression: ${ctx.getText()}")

  override def enterPrimary(ctx: JavaParser.PrimaryContext) = println(s"enterPrimary: ${ctx.getText()}")

  override def exitPrimary(ctx: JavaParser.PrimaryContext) = println(s"exitPrimary: ${ctx.getText()}")

  override def enterCreator(ctx: JavaParser.CreatorContext) = println(s"enterCreator: ${ctx.getText()}")

  override def exitCreator(ctx: JavaParser.CreatorContext) = println(s"exitCreator: ${ctx.getText()}")

  override def enterCreatedName(ctx: JavaParser.CreatedNameContext) = println(s"enterCreatedName: ${ctx.getText()}")

  override def exitCreatedName(ctx: JavaParser.CreatedNameContext) = println(s"exitCreatedName: ${ctx.getText()}")

  override def enterInnerCreator(ctx: JavaParser.InnerCreatorContext) = println(s"enterInnerCreator: ${ctx.getText()}")

  override def exitInnerCreator(ctx: JavaParser.InnerCreatorContext) = println(s"exitInnerCreator: ${ctx.getText()}")

  override def enterArrayCreatorRest(ctx: JavaParser.ArrayCreatorRestContext) = println(s"enterArrayCreatorRest: ${ctx.getText()}")

  override def exitArrayCreatorRest(ctx: JavaParser.ArrayCreatorRestContext) = println(s"exitArrayCreatorRest: ${ctx.getText()}")

  override def enterClassCreatorRest(ctx: JavaParser.ClassCreatorRestContext) = println(s"enterClassCreatorRest: ${ctx.getText()}")

  override def exitClassCreatorRest(ctx: JavaParser.ClassCreatorRestContext) = println(s"exitClassCreatorRest: ${ctx.getText()}")

  override def enterExplicitGenericInvocation(ctx: JavaParser.ExplicitGenericInvocationContext) = println(s"enterExplicitGenericInvocation: ${ctx.getText()}")

  override def exitExplicitGenericInvocation(ctx: JavaParser.ExplicitGenericInvocationContext) = println(s"exitExplicitGenericInvocation: ${ctx.getText()}")

  override def enterNonWildcardTypeArguments(ctx: JavaParser.NonWildcardTypeArgumentsContext) = println(s"enterNonWildcardTypeArguments: ${ctx.getText()}")

  override def exitNonWildcardTypeArguments(ctx: JavaParser.NonWildcardTypeArgumentsContext) = println(s"exitNonWildcardTypeArguments: ${ctx.getText()}")

  override def enterTypeArgumentsOrDiamond(ctx: JavaParser.TypeArgumentsOrDiamondContext) = println(s"enterTypeArgumentsOrDiamond: ${ctx.getText()}")

  override def exitTypeArgumentsOrDiamond(ctx: JavaParser.TypeArgumentsOrDiamondContext) = println(s"exitTypeArgumentsOrDiamond: ${ctx.getText()}")

  override def enterNonWildcardTypeArgumentsOrDiamond(ctx: JavaParser.NonWildcardTypeArgumentsOrDiamondContext) = println(s"enterNonWildcardTypeArgumentsOrDiamond: ${ctx.getText()}")

  override def exitNonWildcardTypeArgumentsOrDiamond(ctx: JavaParser.NonWildcardTypeArgumentsOrDiamondContext) = println(s"exitNonWildcardTypeArgumentsOrDiamond: ${ctx.getText()}")

  override def enterExplicitGenericInvocationSuffix(ctx: JavaParser.ExplicitGenericInvocationSuffixContext) = println(s"enterExplicitGenericInvocationSuffix: ${ctx.getText()}")

  override def exitExplicitGenericInvocationSuffix(ctx: JavaParser.ExplicitGenericInvocationSuffixContext) = println(s"exitExplicitGenericInvocationSuffix: ${ctx.getText()}")

  override def enterArguments(ctx: JavaParser.ArgumentsContext) = println(s"enterArguments: ${ctx.getText()}")

  override def exitArguments(ctx: JavaParser.ArgumentsContext) = println(s"exitArguments: ${ctx.getText()}")

  override def enterEveryRule(ctx: ParserRuleContext) = println(s"enterEveryRule: ${ctx.getText()}")

  override def exitEveryRule(ctx: ParserRuleContext) = println(s"exitEveryRule: ${ctx.getText()}")

  override def enterSuperSuffix(ctx: JavaParser.SuperSuffixContext) = println(s"enterSuperSuffix: ${ctx.getText()}")

  override def exitSuperSuffix(ctx: JavaParser.SuperSuffixContext) = println(s"exitSuperSuffix: ${ctx.getText()}")

  override def visitTerminal(node: TerminalNode) = println(s"visitTerminal: ${node.getText()}")

  override def visitErrorNode(node: ErrorNode) = println(s"visitErrorNode: ${node.getText()}")
}
