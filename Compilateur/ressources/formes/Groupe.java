package formes;

import attributes.Attribute;
import expressions.Expression;
import svgwriter.SVGWriter;

public class Groupe implements Forme{

	private Expression x,y;
	private Attribute a;
	private Forme f;
	
	public Groupe(Expression x, Expression y, Attribute a, Forme f)
	{
		this.x=x;
		this.y=y;
		this.a=a;
		this.f=f;
	}
	
	@Override
	public void run() {
		SVGWriter.beginGroup(x.getValue(),y.getValue(),a);
		f.run();
		SVGWriter.endGroup();
	}

}
