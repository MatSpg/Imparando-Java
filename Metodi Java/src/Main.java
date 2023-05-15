
public class Main {

	public static void main(String[] args) {
		faiPasta("Pennette", 250);
		
		int persone = persone(250);
		System.out.println("Return Persone: "+persone);
		
		double grammi = grammi(250.45);
		System.out.println("Return Grammi: "+grammi);
		
		int addizione1 = addizione(5, 10);
		System.out.println("Return Addizione (2 Parametri): "+addizione1);
		
		int addizione2 = addizione(5, 10, 20);
		System.out.println("Return Addizione (3 Parametri): "+addizione2);
	}
	
	// Metodi = Funzioni
	
	// void = Quando non si ritorna niente (Es. return x;)
	static void faiPasta(String cibo, int grammi) {
		System.out.println("Cucinando Pasta: "+cibo);
		System.out.println("Peso: "+grammi+"gr");
	}
	
	// In caso si vuole fare un return, al posto di void andrà int in questo caso, che specificherà il valore che ritornerà il metodo, in questo caso sarà un intero
	static int persone(int numPers) {
		return numPers;
	}
	
	// double vorrà dire che il metodo ritornerà un numero con la virgola
	static double grammi(double grammi) {
		return grammi;
	}
	
	// Overloaded Methods
	// sono dei metodi ripetuti più volte che hanno lo stesso nome ma si differenziano attraverso la Signature (Parametri)
	static int addizione(int x, int y) {
		return x+y;
	}
	
	static int addizione(int x, int y, int z) {
		return x+y+z;
	}

}
