/*Nella sottoclasse Moto, implementa il metodo "calcolaPrezzo" in modo che il prezzo finale della moto sia il
prezzo base aumentato del 15% se la moto è di marca Ducati, altrimenti aumentato del 10%.- Crea un programma 
Java che crei un'istanza di ogni classe, assegni valori agli attributi e stampi il prezzo finale di ciascun veicolo.*/
public class Moto extends Veicolo{
    public Moto(String marca, String modello, int anno, double prezzo){
        super(marca,modello,anno,prezzo);
    }
    public double calcolaPrezzo(){
        if (marca.equals("Ducati") || marca.equals("ducati")){
            return prezzo+(prezzo*0.15);
        } else {
            return prezzo+(prezzo*0.1);
        }
    }
    public void Print(){
        System.out.println("La MOTO ha come caratteristiche: ");
        super.Print();
    }
}