package attributes;

import expressions.Expression;

public class StrokeWidth implements Attribute{

	private Expression size;
	
	public StrokeWidth(Expression e)
	{
		this.size=e;
	}
	
	@Override
	public String getValue() {
		return "stroke-width:"+size.getValue()+"; ";
	}
}
