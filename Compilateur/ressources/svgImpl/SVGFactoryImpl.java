package svgImpl;

import java.util.HashMap;
import java.util.Map;

import attributes.*;
import builder.*;
import builder.StringBuilder;
import expressions.*;
import formes.*;
import instructions.*;
import svg.*;

public class SVGFactoryImpl implements SVGFactory{

	private Map<String, Integer> vars=new HashMap<>();
	int cpt=0;
	
	@Override
	public Bloc createBloc(Instruction i) {
		return new Bloc(vars, i);
	}
	
////////////////////////////////////////////////////////////////////	
	
	@Override
	public Expression createNodeVariable(String id) {
		return new Variable(id,vars);
	}

	@Override
	public Expression createNodeMinus(Expression e) {
		return new MinusExpression(e);
	}

	@Override
	public Expression createNodePlus(Expression e) {
		return e;
	}

	@Override
	public Expression createNodeDiv(Expression e1, Expression e2) {
		return new DivExpression(e1,e2);
	}

	@Override
	public Expression createNodeMult(Expression e1, Expression e2) {
		return new MultExpression(e1,e2);
	}

	@Override
	public Expression createNodeSub(Expression e1, Expression e2) {
		return new MinusExpression(e1, e2);
	}

	@Override
	public Expression createNodeAdd(Expression e1, Expression e2) {
		return new AddExpression(e1,e2);
	}
	
	@Override
	public Expression createNodeReal(Integer i) {
		return new Real(i);
	}
	
	
//////////////////////////////////////////////////////////////////////

	@Override
	public Instruction createInstructions(Instruction is, Instruction i) {
		return new Instructions(is, i);
	}
	
	@Override
	public Instruction createNodeAffect(String a, Expression p) {
		return new Affect(a,p);
	}
	
	@Override
	public Instruction createNodeRepeat(Expression n, Instruction i) {
		return new Repeat(n,i);
	}
	
	@Override
	public Instruction createNodeForm(Forme f) {
		return new FormInstruction(f);
	}
	
///////////////////////////////////////////////////////////////////////
	
	@Override
	public Str createStringBuilder(Str strs, Str str) {
		return new StringBuilder(strs,str);
	}

	@Override
	public Str createStringPiece(String s) {
		return new StringPiece(s);
	}
	
//////////////////////////////////////////////////////////////////////////

	@Override
	public Forme createNodeEllipse(Expression cx, Expression cy, Expression rx, Expression ry, Attribute a) {
		return new Ellipse(cx,cy,rx,ry,a);
	}

	@Override
	public Forme createNodeCircle(Expression cx, Expression cy, Expression r, Attribute a) {
		return new Circle(cx,cy,r,a);
	}

	@Override
	public Forme createNodeLigne(Expression x1, Expression y1, Expression x2, Expression y2, Attribute a) {
		return new Ligne(x1,y1,x2,y2,a);
	}

	@Override
	public Forme createNodeTexte(Expression x, Expression y, Str s, Attribute a) {
		return new Texte(x, y, s,a);
	}

	@Override
	public Forme createNodeRect(Expression x, Expression y, Expression w, Expression h, Attribute a) {
		return new Rectangle(x,y,w,h,a);
	}
	
	@Override
	public Forme createNodeFormes(Forme f1, Forme f2) {
		return new Formes(f1, f2);
	}
	
	@Override
	public Forme createNodeGroupe(Expression x, Expression y, Attribute a, Forme f) {
		return new Groupe(x,y,a,f);
	}
	
/////////////////////////////////////////////////////////////////////////
	
	
	@Override
	public Attribute createNodeAttributes(Attribute as, Attribute a) {
		return new Attributes(as,a);
	}

	@Override
	public Attribute createNodeStroke(String c) {
		return new Stroke(c);
	}

	@Override
	public Attribute createNodeFill(String c) {
		return new Fill(c);
	}

	@Override
	public Attribute createNodeStrokeWidth(Expression e) {
		return new StrokeWidth(e);
	}

	@Override
	public Attribute createNodeFontSize(Expression e) {
		return new FontSize(e);
	}

	@Override
	public Attribute createNodeCourbure(Expression e1, Expression e2) {
		return new Courbure(e1,e2);
	}
}
