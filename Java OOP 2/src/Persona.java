
public class Persona {
	
	String nome;
	String cognome;
	// Static salva il valore di numPersone e nel costruttore viene incrementato tutte le volte che vengono generate delle persone
	static int numPersone;
	
	Persona(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
		numPersone++;
	}
	
	public String toString() {
		return "Nome: "+nome+" | Cognome: "+cognome;
	}
	
	// Metodo Statico
	static void mostraNumPersone(){
		System.out.println("Numero Persone: "+numPersone);
	}
}
