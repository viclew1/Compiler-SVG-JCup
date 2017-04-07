package formes;

import attributes.Attribute;
import builder.Str;
import expressions.Expression;
import svgwriter.SVGWriter;

public class Texte implements Forme {

	private Expression x,y;
	private Str texte;
	private Attribute a;
	
	public Texte(Expression x, Expression y, Str texte, Attribute a)
	{
		this.x=x;
		this.y=y;
		this.texte=texte;
		this.a=a;
	}
	
	@Override
	public void run() {
		SVGWriter.writeText(x.getValue(), y.getValue(), texte.evaluate(),a);
	}
}
