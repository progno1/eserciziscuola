/*Crea una classe astratta chiamata "Veicolo" con i seguenti attributi:
marca (stringa)
modello (stringa)
anno di fabbricazione (intero)
prezzo (doppio)
Aggiungi i seguenti metodi alla classe Veicolo:
Costruttore che inizializza i quattro attributi
Metodo astratto "calcolaPrezzo" che deve essere implementato dalle sottoclassi per calcolare il prezzo finale del veicolo*/
public abstract class Veicolo{
    protected String marca;
    protected String modello;
    protected int anno;
    protected double prezzo;
    public Veicolo(String marca, String modello, int anno, double prezzo){
        this.marca=marca;
        this.modello=modello;
        this.anno=anno;
        this.prezzo=prezzo;
    }
    abstract double calcolaPrezzo();
    
    public void Print(){
        System.out.println("La marca e' "+marca+"\n"+"Il modello e' "+modello+"\n"+"L'anno di produzione e' stato il "+anno+"\n"+"Il prezzo del veicolo e' "+calcolaPrezzo()+"\n");
    }
    
}