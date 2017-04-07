package attributes;

public class Fill implements Attribute{

	private String color;
	
	public Fill(String color)
	{
		this.color=color;
	}
	
	@Override
	public String getValue() {
		return "fill:"+color+"; ";
	}

}
