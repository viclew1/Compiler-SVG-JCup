package instructions;

import java.io.IOException;
import java.util.Map;

import svgwriter.SVGWriter;

public class Bloc {

	Map<String, Integer> vars;
	Instruction statement;
	
	public Bloc(Map<String, Integer> vars, Instruction s)
	{
		this.vars=vars;
		this.statement=s;
		run();
	}
	

	public void run()
	{
		SVGWriter.init();
		statement.run(vars);
		try {
			SVGWriter.write();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
