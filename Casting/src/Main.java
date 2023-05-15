
public class Main {

	public static void main(String[] args) {
		// Il Casting e quel processo che modifica un tipo di dato
		// Implicito: Automatico, quando passiamo ad un tipo più ampio (int->double, float->double)
		// Esplicito: Manuale, quando passiamo ad un tipo più ristretto
		
		// Implicito: Anche se il 9 e un int lo passa automaticamente al tipo double = 9.0
		double x = 9.5;
		System.out.println(x);
		
		// Esplicito: Passiamo da un tipo di dato più grande a uno pià piccolo come l'esempio sotto
		// il 9.5 passa da un numero con la virgola ad un intero grazie a (int)9.5 = 9
		int y = (int)9.5;
		System.out.println(y);
	}

}
