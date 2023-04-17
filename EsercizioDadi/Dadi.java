public class Dadi extends Astratta {
    private int faccia;
    
    public Dadi(){
        
        this.faccia = 0;
    }
    public void Lancio(){
        this.faccia= (int) (Math.random() * 6);
    }
    public void printRisultato(){
        System.out.println("E' uscito il numero "+ faccia);
    }
}
    
