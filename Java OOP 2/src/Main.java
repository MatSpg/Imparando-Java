
public class Main {

	public static void main(String[] args) {
		// Keyword
		// final: indica una variabile che non può essere modificata nel corso del programma
		final int provaFinal = 5;
		// con final cambiando il valore della variabile come provaFinal = 10; sarà un errore
		System.out.println(provaFinal);
		
		// static: indica che l'attributo e univoco per tutte le istanze della classe
		Persona persona1 = new Persona("Luca", "Rossi");
		Persona persona2 = new Persona("Marco", "Verdi");
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		
		// Metodo Statico
		Persona.mostraNumPersone();
	}

}
