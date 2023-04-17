/******************************************************************************

Realizza un programma che sia in grado di valutare il volume di oggetti tridimensionali 
come cilindri e parallelepipedi basandosi sul valore della loro area e dell'altezza. 
Delegare i metodi comuni, come il calcolo e la stampa del volume ad una classe astratta.


*******************************************************************************/

public class Main {
    
        public static void main(String[] args) {
            Cilindro cilindroN1 = new Cilindro(5, 7);
            cilindroN1.printVolume();
    
            Parallelepipedo parallelepipedoN1 = new Parallelepipedo(2, 5, 7);
            parallelepipedoN1.printVolume();
        }

}