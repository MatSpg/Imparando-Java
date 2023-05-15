
public class Macchina extends Veicolo {
	// Questi metodi sono della classe astratta Veicolo
	@Override
	void muovi() {
		System.out.println("Il veicolo e in movimento");
	}
	
	@Override
	void frena() {
		System.out.println("Il veicolo sta frenando");
	}
}
