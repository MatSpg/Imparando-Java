
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// Array List 2D
		ArrayList<ArrayList<String>> classi = new ArrayList();
		
		// ArrayList
		ArrayList<String> classe = new ArrayList<String>();
		
		classe.add("Mattia");
		classe.add("Marco");
		classe.add("Anna");
		
		// Cancellare elemento dal ArrayList
		classe.remove(0);
		
		ArrayList<String> classe2 = new ArrayList<String>();
		
		classe2.add("Prova");
		classe2.add("Ciao");
		classe2.add("Tre");
		
		classi.add(classe);
		classi.add(classe2);
		
		for (int i = 0; i < classi.size(); i++) {
			for (int j = 0; j < classi.get(i).size(); j++) {
				System.out.println(classi.get(i).get(j));
			}
		}
		
	}

}
