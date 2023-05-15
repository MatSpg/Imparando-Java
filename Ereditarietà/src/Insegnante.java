
public class Insegnante extends Persona{
	
	String materia = "Matematica";
	
	Insegnante(String nome, String cognome, String materia){
		super(nome, cognome);
		this.materia = materia;
	}
	
	void insegna() {
		System.out.println("Sto Insegnando...");
	}
	
	// Sovrascrive il Metodo Saluta
	@Override
	void saluta() {
		System.out.println("Ciao ragazzi!");
	}
}
