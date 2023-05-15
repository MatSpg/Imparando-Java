
public class Persona {
	// Lo Scope delle variabili e il raggio d'azione in cui le variabili possono essere chiamate
	// Le seguenti variabili sono Scope Globali
	String nome;
	String cognome;
	int eta;
	String colore;
	
	// Constructor
	Persona(String nome, String cognome, int eta, String colore){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.colore = colore;
	}
	
	// Metodi
	void saluta() {
		// Richimando una variabile di Scope Globale
		System.out.println("Ciao sono "+this.nome);
	}
	
	// Esempio per lo Scope delle variabili
	void addizione(int a, int b) {
		// Varibile con Scope Locale
		// E stata creata all'interno di un metodo, quindi utilizzabile solo all'interno del seguente metodo
		int risultato = a+b;
		System.out.println(risultato);
	}
	
	public String toString() {
		String stringa = "Nome: "+nome+" | Cognome: "+cognome+" | Età: "+eta+" | Colore: "+colore;
		return stringa;
	}
	
	// Passare Oggetti come parametri di metodi
	void saluta2(Persona personaDaSalutare) {
		System.out.println("Ciao "+personaDaSalutare.nome+" io sono "+this.nome);
	}
}
