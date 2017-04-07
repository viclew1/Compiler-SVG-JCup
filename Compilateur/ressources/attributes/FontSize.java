package attributes;

import expressions.Expression;

public class FontSize implements Attribute{

	private Expression size;
	
	public FontSize(Expression e)
	{
		this.size=e;
	}
	
	@Override
	public String getValue() {
		return "font-size:"+size.getValue()+"; ";
	}
}
