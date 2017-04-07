package instructions;

import java.util.Map;

public class Instructions implements Instruction{

	private Instruction is, i;
	
	public Instructions(Instruction is, Instruction i) {
		this.is=is;
		this.i=i;
	}
	
	@Override
	public void run(Map<String, Integer> hm) {
		if (is!=null)
			is.run(hm);
		if (i!=null)
			i.run(hm);
	}
}