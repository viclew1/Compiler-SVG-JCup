package builder;

public class StringBuilder implements Str {

	private Str strs;
	private Str str;
	
	public StringBuilder(Str strs, Str str) {
		this.strs=strs;
		this.str=str;
	}

	@Override
	public String evaluate() {
		if (strs==null)
			return str.evaluate();
		return strs.evaluate()+" "+str.evaluate();
	}

}
