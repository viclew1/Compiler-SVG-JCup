package expressions;

public class Real implements Expression {

	private Integer valeur;
	
	public Real(Integer valeur)
	{
		this.valeur=valeur;
	}
	
	@Override
	public Integer getValue() {
		return valeur;
	}

}
