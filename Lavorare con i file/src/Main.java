import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		
		// Verificare etc.
		File file = new File("prova.txt");
		
		if(file.exists()) {
			System.out.println("Il File Esiste");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			
			// Controlla se è un file ritorna true mentre se e una cartella ritorna false
			System.out.println(file.isFile());
			
			file.delete();
		} else {
			System.out.println("Il File Non Esiste");
		}
		
		// Scrivere un file
		try {
			// In caso non esista il file lo crea
			FileWriter writer = new FileWriter("prova.txt");
			
			// Ogni volta sostituisce quello che c'è scritto già
			writer.write("Ciao sono Mattia \nProva");
			
			// Mentre questo aggiunge del testo
			writer.append("\nHo appeso questa stringa");
			writer.append("\nHo appeso questa stringa 2");
			
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Leggere un file
		try {
			FileReader reader = new FileReader("prova.txt");
			
			// Ritornerà del codice ASCII per il primo carattere
			int data = reader.read();
			// Ritorna codice ASCII per ogni carattere nel file finche non sarà -1 che indica la fine
			while(data != -1) {
				// Trasformiamo l'ASCII del carattere in un vero e proprio Carattere utilizzando (char)data
				System.out.print((char)data);
				// Passa alla prossima lettera
				data = reader.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
 	}

}
