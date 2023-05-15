package Pacchetto1;

public class Persona {
	// Non sono modificabili tramite persona.nome = "Stringa";
	// Ma si possono modificare o prendre solo tramite dei metodi chiamati Getters e Setters
	private String nome;
	private String cognome;
	
	Persona(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
	}
	
	// Getters | Sono dei metodi che ci permettono di accedere ad attributi
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	// Setters | Sono dei metodi che ci permettono di modificare/settare degli attributi
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	// Copia di un oggetto
	/* public void copy(Persona persona) {
		this.setNome(persona.getNome());
		this.setCognome(persona.getCognome());
	}*/
	// Oppure con overloaded methods
	Persona(Persona persona){
		this.setNome(persona.getNome());
		this.setCognome(persona.getCognome());
	}
}
