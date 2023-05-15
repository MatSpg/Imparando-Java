package Pacchetto1;

// L'incapsulamento e un processo in cui nascondiamo attributi di una classe all'esterno, 
// mettendoli private diventano accessibili solo tramite dei metodi (getters/setters)
public class Main {

	public static void main(String[] args) {
		Persona persona = new Persona("Luca", "Rossi");
		
		persona.setNome("Mattia");
		persona.setCognome("Spagnuolo");
		
		// Persona persona2 = new Persona("Marco", "Verdi");
		// persona.copy(persona2);
		// Oppure
		Persona persona2 = new Persona(persona);
		
		System.out.println(persona.getNome());
		System.out.println(persona.getCognome());
		
		System.out.println(persona2.getNome());
		System.out.println(persona2.getCognome());
	}

}
