import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// Data e Ora
		
		// Prendere la data attuale
		LocalDate data = LocalDate.now();
		System.out.println("Data: "+data);
		
		// Prendere l'ora attuale
		LocalTime ora = LocalTime.now();
		System.out.println("Ora: "+ora);
		
		// Prendere data e ora attuali
		LocalDateTime dataOra = LocalDateTime.now();
		System.out.println("Data e Ora: "+dataOra);
		
		// Formattare Date e Ora 
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");
		System.out.println("Data e Ora Formattati: "+dataOra.format(format));
	}

}
