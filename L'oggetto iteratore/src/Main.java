import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// Un iteratore e un oggetto che cicla un ArrayList
		ArrayList<String> persone = new ArrayList<String>();
		
		persone.add("Luca");
		persone.add("Marco");
		persone.add("Anna");
		persone.add("Paolo");
		
		Iterator<String> it = persone.iterator();
		
		while(it.hasNext()) {
			String persona = it.next();
			if (persona == "Anna") {
				it.remove();
			}
			System.out.println(persone);
		}
	}

}
