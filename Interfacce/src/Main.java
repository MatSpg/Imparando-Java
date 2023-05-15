
public class Main {

	public static void main(String[] args) {
		// Un interfaccia e molto simile ad una classe astratta, ma possono essere 
		// implementate più volte su più classi
		Leone leone = new Leone();
		Gazzella gazzella = new Gazzella();
		Pesce pesce = new Pesce();
		
		leone.caccia();
		gazzella.scappa();
		
		pesce.caccia();
		pesce.scappa();
	}
	
}
