package instructions;

import java.util.Map;

import formes.Forme;

public class FormInstruction implements Instruction {

	private Forme forme;

	public FormInstruction(Forme f)
	{
		this.forme=f;
	}

	@Override
	public void run(Map<String, Integer> hm) {
		forme.run();
	}

}
