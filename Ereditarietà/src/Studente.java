
public class Studente extends Persona {
	
	String materiaPreferita = "Storia";
	
	Studente(String nome, String cognome, String materiaPreferita){
		// super = sopra | Prende la classe da cui deriva e gli passa i valori, prende i valori da Persona
		super(nome, cognome);
		this.materiaPreferita = materiaPreferita;
	}
	
	void studiando() {
		System.out.println("Sto Studiando...");
	}
	
	// Sovrascrive il Metodo Saluta, che già esisteva nella classe Persona
	@Override
	void saluta() {
		System.out.println("Ciao prof.!");
	}
}
