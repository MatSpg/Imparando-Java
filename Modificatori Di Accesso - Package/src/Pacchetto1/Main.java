package Pacchetto1;
//Stiamo importando tutto il quello che si trova nel Package: Pacchetto1
import Pacchetto2.*;

// I modificatori d'accesso servono per aggiungere un livello di sicurezza dentro l'applicazione
// Ci permettono di mostrare o meno determinato metodi e attributi in giro per il nostro codice

// Dove e possibile utilizzare i vari modificatori di accesso:
// 			class | package | subclass | world
// public	  Si 	   Si		 Si 	   Si
// protected  Si 	   Si		 Si 	   No
// default	  Si 	   Si		 No		   No
// private	  Si 	   No		 No 	   No

public class Main {

	public static void main(String[] args) {
		B prova = new B();
		System.out.println(prova.nome);
	}

}
