import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// Hashmap = Come gli oggetti in javascript
		HashMap<String, String> capitali = new HashMap<String, String>();
		
		// Aggiungere dei dati al HashMap
		capitali.put("Italia", "Roma");
		capitali.put("Inghilterra", "Londra");
		
		// Mostrare un valore di un dato specifico che sta all'interno del HashMap
		System.out.println(capitali.get("Italia"));
		// Mostrare l'intero HashMap
		System.out.println(capitali);
		
		// Rimuovi dal HashMape il dato specifico
		capitali.remove("Italia");
		System.out.println(capitali);
		
		// Cancella tutto dal HashMap
		capitali.clear();
		System.out.println(capitali);
	}

}
