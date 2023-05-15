
// OOP = Object Oriented Programming

public class Main {

	public static void main(String[] args) {
		// Creare un Oggetto con Parametri Personalizzati
		Persona persona1 = new Persona("Luca", "Rossi", 25, "Blue");
		Persona persona2 = new Persona("Marco", "Verdi", 32, "Rosso");
		
		// Prendere il valore di una variabile
		System.out.println("Cognome "+persona1.cognome);
		System.out.println("Cognome "+persona2.cognome);
		
		// Chiamare un metodo che esiste nel Oggetto Persona
		persona1.saluta();
		persona2.saluta();
		
		// Metodo toString proveniente dall'oggetto Persona
		System.out.println("Metodo toString(): "+persona1.toString());
		
		// Array di Oggetti
		// Persona[] persone = new Persona[2]; Oppure
		Persona[] persone = {persona1, persona2};
		System.out.println("Array Di Oggetti: "+persone[0]);
		System.out.println("Array Di Oggetti: "+persone[1]);
		
		// Passare Oggetti come parametri di metodi
		persona1.saluta2(persona2);
		persona2.saluta2(persona1);
		
		// Overloaded Constructors: Oggetto Pizza 
		Pizza pizza1 = new Pizza("itegrale", "pomodoro", "mozzarella", "patatine");
		Pizza pizza2 = new Pizza("cereali", "pomodoro");
		Pizza pizza3 = new Pizza("farina");
	}

}
