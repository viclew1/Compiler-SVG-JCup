package instructions;

public class SVGCompiler {

	private Bloc bloc;
	
	public SVGCompiler(Bloc bloc)
	{
		this.bloc=bloc;
	}
	
	public void evaluateTree()
	{
		bloc.run();
	}
	
}
