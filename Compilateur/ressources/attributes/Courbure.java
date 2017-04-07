package attributes;

import expressions.Expression;

public class Courbure implements Attribute {

	private Expression rx,ry;
	
	public Courbure(Expression rx,Expression ry)
	{
		this.rx=rx;
		this.ry=ry;
	}
	
	@Override
	public String getValue() {
		return "rx:"+rx.getValue()+"; "+"ry:"+ry.getValue()+"; ";
	}

}
