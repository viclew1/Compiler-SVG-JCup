package formes;


import attributes.Attribute;
import expressions.Expression;
import svgwriter.SVGWriter;

public class Circle implements Forme {

	private Expression cx,cy,r;
	private Attribute a;
	
	public Circle(Expression cx, Expression cy, Expression r, Attribute a) {
		this.cx=cx;
		this.cy=cy;
		this.r=r;
		this.a=a;
	}

	@Override
	public void run() {
		SVGWriter.writeCircle(cx.getValue(), cy.getValue(), r.getValue(), a);
	}
}
