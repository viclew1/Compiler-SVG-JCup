package formes;

import attributes.Attribute;
import expressions.Expression;
import svgwriter.SVGWriter;

public class Rectangle implements Forme {

	private Expression x,y,w,h;
	private Attribute a;
	
	public Rectangle(Expression x, Expression y, Expression w, Expression h, Attribute a) {
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
		this.a=a;
	}

	@Override
	public void run() {
		SVGWriter.writeRect(x.getValue(), y.getValue(), w.getValue(), h.getValue(),a);
	}

}
