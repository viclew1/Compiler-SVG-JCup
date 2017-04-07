package formes;

import attributes.Attribute;
import expressions.Expression;
import svgwriter.SVGWriter;

public class Ligne implements Forme{

	private Expression x1,y1,x2,y2;
	private Attribute a;
	
	public Ligne(Expression x1, Expression y1, Expression x2, Expression y2, Attribute a)
	{
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y1=y1;
		this.a=a;
	}
	
	@Override
	public void run() {
		SVGWriter.writeLine(x1.getValue(),y1.getValue(),x2.getValue(),y2.getValue(),a);
	}
}
