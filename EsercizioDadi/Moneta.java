public class Moneta extends Astratta {
    private int faccia;
    
    public Moneta(){
        
        this.faccia = 0;
    }
    public void Lancio(){
        this.faccia= (int) (Math.random() * 2);
    }
    public void printRisultato(){
        if (faccia==0){
                System.out.println("Testa");
            } else {
                System.out.println("Croce");
        }
    }
    
}