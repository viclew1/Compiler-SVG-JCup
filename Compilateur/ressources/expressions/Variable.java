package expressions;

import java.util.Map;

public class Variable implements Expression {

	private Map<String, Integer> vars;
	private String id;
	
	public Variable(String id, Map<String, Integer> vars) {
		this.id=id;
		this.vars=vars;
	}

	@Override
	public Integer getValue() {
		return vars.get(id);
	}

}