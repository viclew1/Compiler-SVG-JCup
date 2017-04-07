package svg;

import expressions.Expression;
import formes.Forme;
import instructions.Bloc;
import instructions.Instruction;
import attributes.Attribute;
import builder.Str;

public interface SVGFactory {

	Bloc createBloc(Instruction i);
	Instruction createInstructions(Instruction is, Instruction i);
	
	Expression createNodeVariable(String id);
	Expression createNodeMinus(Expression e);
	Expression createNodePlus(Expression e);
	Expression createNodeDiv(Expression e1, Expression e2);
	Expression createNodeMult(Expression e1, Expression e2);
	Expression createNodeSub(Expression e1, Expression e2);
	Expression createNodeAdd(Expression e1, Expression e2);
	Expression createNodeReal(Integer i);
	
	Instruction createNodeAffect(String a, Expression p);
	Instruction createNodeRepeat(Expression n, Instruction i);
	Instruction createNodeForm(Forme f);
	
	Forme createNodeEllipse(Expression cx,Expression cy,Expression rx,Expression ry, Attribute a);
	Forme createNodeCircle(Expression cx,Expression cy,Expression r, Attribute a);
	Forme createNodeLigne(Expression x1,Expression y1,Expression x2,Expression y2, Attribute a);
	Forme createNodeTexte(Expression x, Expression y, Str s, Attribute a);
	Forme createNodeRect(Expression x, Expression y, Expression w, Expression h, Attribute a);
	Forme createNodeFormes(Forme f1, Forme f2);
	Forme createNodeGroupe(Expression x, Expression y, Attribute a, Forme f);
	
	Str createStringBuilder(Str strs, Str str);
	Str createStringPiece(String s);
	
	Attribute createNodeAttributes(Attribute as, Attribute a);
	Attribute createNodeStroke(String c);
	Attribute createNodeFill(String c);
	Attribute createNodeStrokeWidth(Expression e);
	Attribute createNodeFontSize(Expression e);
	Attribute createNodeCourbure(Expression e1, Expression e2);
	
}
