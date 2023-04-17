/******************************************************************************
5. Implementare una classe che rappresenti le caratteristiche e le funzionalità di un computer.
Di questa classe implementare due metodi, uno che stampi le caratteristiche dell'oggetto e l'altro per il potenziamento della RAM:
dato in ingresso il numero di Gigabyte aggiuntivi ne registri l'incremento sull'oggetto.
Implementare, inoltre, all'interno del metodo main più oggetti,
cioè più computer con caratteristiche diverse e per ogni caso richiamare i metodi.
Ps.: La classe deve avere un costruttore specifico.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    Computer computerAsus = new Computer (10, "RTX 3080", "Windows");
	    
	    Computer computerMAC = new Computer (20, "Scheda Video", "MacOS");
	    
	    computerMAC.stampa();
	    computerMAC.incremento_RAM();

	}
}
