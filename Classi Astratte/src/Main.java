
public class Main {

	public static void main(String[] args) {
		// Le classi astratte sono delle classi che noi definiamo affinche vengano esclusivamente ereditate da altre classi
		// Veicolo veicolo1 = new Veicolo(); non funzionerà perchè le classi astratte non permettono di creare un oggetto
		Macchina macchina = new Macchina();
		macchina.muovi();
		macchina.frena();
	}

}
