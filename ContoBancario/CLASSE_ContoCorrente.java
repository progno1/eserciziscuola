import java.util.Scanner;
 public class ContoCorrente {
    public String IBAN;
    public int denaro;
    public ContoCorrente(String ibn, int d){
        this.IBAN=ibn;
        this.denaro=d;
    }
    Scanner input = new Scanner(System.in);
        public void prelievo(){
            System.out.println("Quanti soldi vuoi prelevare? ");
            int importoPr = input.nextInt();
            if (importoPr<denaro){
                denaro=denaro-importoPr;
            } else {
                System.out.println("Non puoi prelevare piu soldi di quanti tu ne abbia! ");
            }   
        }
        
        public void deposito(){
            System.out.println("Quanti soldi vuoi depositare? ");
            int depositoPr = input.nextInt();
            if (depositoPr<50000){
                denaro=denaro+depositoPr;
            } else {
                System.out.println("Non puoi depositare una somma di denaro cosi' grande! ");
            }   
        }
        public void bonifico(){
            System.out.println("Quanti soldi vuoi inviare?"){
                int bonificoN = input.nextInt();
                if (bonificoN<denaro){
                    denaro= bonificoN-denaro;
                } else {
                    System.out.println("Non puoi inviare piu' soldi di quanti tu ne abbia! ");
                }
            }
        }
}