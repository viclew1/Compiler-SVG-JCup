package attributes;

public class Stroke implements Attribute{

	private String color;
	
	public Stroke(String color)
	{
		this.color=color;
	}
	
	@Override
	public String getValue() {
		return "stroke:"+color+"; ";
	}

}
