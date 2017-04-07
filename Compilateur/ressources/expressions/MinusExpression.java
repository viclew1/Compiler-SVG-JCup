package expressions;

public class MinusExpression implements Expression {

	private Expression e1,e2;
	
	public MinusExpression(Expression e1) {
		this.e1=e1;
	}
	
	public MinusExpression(Expression e1, Expression e2)
	{
		this.e1=e1;
		this.e2=e2;
	}
	
	
	@Override
	public Integer getValue() {
		if (e2==null)
			return -e1.getValue();
		return e1.getValue()-e2.getValue();
	}

}
