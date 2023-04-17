/******************************************************************************
Scrivi un programma che simuli il lancio di un dado e di una moneta stampandone il risultato
con l'utilizzo di una classe astratta che rappresenti i comportamenti comuni degli oggetti dado e moneta istanziati.


*******************************************************************************/

public class Main {
    
        public static void main(String[] args) {
            Moneta monetaN1 = new Moneta();
            monetaN1.Lancio();
            monetaN1.printRisultato();
            
            Dadi dadiN1 = new Dadi();
            dadiN1.Lancio();
            dadiN1.printRisultato();
            
        }

}