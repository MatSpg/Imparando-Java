
public class Pesce implements Preda, Predatore{

	@Override
	public void caccia() {
		System.out.println("Il pesce sta attaccando");
	}

	@Override
	public void scappa() {
		System.out.println("Il pesce sta scappando");
	}

}
