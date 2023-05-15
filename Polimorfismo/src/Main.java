
public class Main {

	public static void main(String[] args) {
		// Il Polimorfismo è la capacità di un oggetto di identificarsi con più tipi di dato
		Studente studente = new Studente("Mattia", "Spagnuolo");
		Insegnante insegnante = new Insegnante("Marco", "Verdi");
		
		// Il polimorfismo permette di identificarsi con più tipi da dato ma attraverso un tipo di dato
		// che hanno in comune, in questo caso e Persona
		Persona[] classe = {studente, insegnante};
		
		for(Persona persona: classe) {
			// In caso di errore che non riconosce il metodo e perchè non esiste il seguente metodo
			// nella classe in comune, in questo caso la classe Persona
			persona.saluta();
		}
	}

}
