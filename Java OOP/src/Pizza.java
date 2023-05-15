
public class Pizza {
	// Variabili con Scope Globali
	String impasto;
	String salsa;
	String formaggio;
	String extra;
	
	// Constructor
	Pizza(String impasto, String salsa, String formaggio, String extra){
		this.impasto = impasto;
		this.salsa = salsa;
		this.formaggio = formaggio;
		this.extra = extra;
		System.out.println("Impasto: "+impasto+" | Salsa: "+salsa+" | Formaggio: "+formaggio+" | Extra: "+extra);
	}
	
	// Overloaded Constructor
	// Stessa cosa degli Overloaded Methods
	Pizza(String impasto){
		this.impasto = impasto;
		System.out.println("Impasto: "+impasto);
	}
	
	Pizza(String impasto, String salsa){
		this.impasto = salsa;
		this.salsa = salsa;
		System.out.println("Impasto: "+impasto+" | Salsa: "+salsa);
	}
}
