/*Crea due sottoclassi di Veicolo chiamate "Auto" e "Moto". Entrambe le sottoclassi devono estendere la classe Veicolo
e implementare il metodo "calcolaPrezzo".- Nella sottoclasse Auto, implementa il metodo "calcolaPrezzo" in modo che il
prezzo finale dell'auto sia il prezzo base aumentato del 10% se l'auto è stata fabbricata negli ultimi 5 anni, altrimenti
aumentato del 20%*/
public class Auto extends Veicolo{
    public Auto(String marca, String modello, int anno, double prezzo){
        super(marca,modello,anno,prezzo);
    }
    public double calcolaPrezzo(){
        if (anno>(2023-5)){
            return prezzo+(prezzo*0.1);
        } else {
            return prezzo+(prezzo*0.2);
        }
    }
    public void Print(){
        System.out.println("La MACCHINA ha come caratteristiche : ");
        super.Print();
    }
}