package instructions;

import java.util.Map;

import expressions.Expression;

public class Repeat implements Instruction{

	private Instruction i;
	private Expression n;

	public Repeat(Expression n, Instruction i)
	{
		this.n=n;
		this.i=i;
	}

	@Override
	public void run(Map<String, Integer> hm) {
		for (int i=0;i<n.getValue();i++)
			this.i.run(hm);
	}
}
