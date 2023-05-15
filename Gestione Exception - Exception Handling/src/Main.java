import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Inserisci un numero: ");
			int x = scanner.nextInt();
			
			System.out.println("Inserire il secondo numero: ");
			int y = scanner.nextInt();
			
			int result = x/y;
			
			System.out.println("Risultato: "+result);
		} catch(ArithmeticException e) {
			System.out.println("Non puoi dividere così");
		} catch(InputMismatchException e) {
			System.out.println("Non puoi dividere un numero con una stringa");
		} catch(Exception e) {
			System.out.println("Errore");
		} finally {
			System.out.println("Programma Eseguito");
		}
		// finally: a prescindere di come va la situazione verrà sempre eseguito
	}

}
