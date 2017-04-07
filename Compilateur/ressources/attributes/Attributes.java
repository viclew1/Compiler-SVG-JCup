package attributes;

public class Attributes implements Attribute{

	private Attribute as,a;

	public Attributes(Attribute as, Attribute a) {
		this.as=as;
		this.a=a;
	}

	@Override
	public String getValue() {
		String value="";
		if (as!=null)
			value+=as.getValue();
		if (a!=null)
			value+=a.getValue();
		return value;
	}

}
