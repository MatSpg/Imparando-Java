
// Aggiungere abstract per farla diventare una classe astratta
public abstract class Veicolo {
	
	// Nei metodi astratti non permettono di inserire cose al suo interno
	// I metodi astratti dovranno essere implementati all'interno della classe macchina quindi in una classe non astratta
	abstract void muovi();
	abstract void frena();
}
