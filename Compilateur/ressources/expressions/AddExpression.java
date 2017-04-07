package expressions;

public class AddExpression implements Expression {

private Expression e1,e2;
	
	public AddExpression(Expression e1, Expression e2) {
		this.e1=e1;
		this.e2=e2;
	}
	
	@Override
	public Integer getValue() {
		return e1.getValue()+e2.getValue();
	}

}
