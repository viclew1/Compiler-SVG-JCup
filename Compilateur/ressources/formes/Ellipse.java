package formes;

import attributes.Attribute;
import expressions.Expression;
import svgwriter.SVGWriter;

public class Ellipse implements Forme {

	private Expression cx,cy,rx,ry;
	private Attribute a;
	
	public Ellipse(Expression cx, Expression cy, Expression rx, Expression ry, Attribute a) {
		this.cx=cx;
		this.cy=cy;
		this.rx=rx;
		this.ry=ry;
		this.a=a;
	}
	
	@Override
	public void run() {
		SVGWriter.writeEllipse(cx.getValue(), cy.getValue(), rx.getValue(), ry.getValue(),a);
	}

}
