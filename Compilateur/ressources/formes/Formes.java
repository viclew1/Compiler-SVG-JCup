package formes;

public class Formes implements Forme{

	private Forme f1,f2;

	public Formes(Forme f1, Forme f2)
	{
		this.f1=f1;
		this.f2=f2;
	}

	@Override
	public void run() {
		if (f1!=null)
			f1.run();
		if (f2!=null)
			f2.run();
	}

}
