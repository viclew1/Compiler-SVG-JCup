package builder;

public class StringPiece implements Str{

	private String str;
	
	
	public StringPiece(String str) {
		this.str=str;
	}
	
	@Override
	public String evaluate() {
		return str;
	}

}
