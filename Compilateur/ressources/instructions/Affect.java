package instructions;

import java.util.Map;

import expressions.Expression;

public class Affect implements Instruction{

	String var;
	Expression exp;

	public Affect(String a, Expression e)
	{
		var=a;
		exp=e;
	}

	@Override
	public void run(Map<String, Integer> vars) {
		vars.put(var,exp.getValue());
	}
}