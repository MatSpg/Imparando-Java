
public class Main {
	
	public static void main(String[] args){
		// Cos'è l'ereditarietà: un meccanisco che permetta ad una classe di derviare da un altra classe ed ereditarne metodi e attributi
		Persona persona1 = new Persona("Luca", "Rossi");
		Persona persona2 = new Persona("Marco", "Verdi");
		
		Studente studente1 = new Studente(persona1.nome, persona1.cognome, "Matematica");
		studente1.saluta();
		
		Insegnante insegnante1 = new Insegnante(persona2.nome, persona2.cognome, "Storia");
		insegnante1.saluta();
	}

}
