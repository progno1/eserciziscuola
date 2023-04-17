/******************************************************************************

3)  Caricare un vettore di N posizioni, stampando la somma dei suoi elementi. 

*******************************************************************************/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Di quanti elementi vuoi creare il vettore : ");
        int n = input.nextInt();
        int somma = 0;
        int numero []= new int[n];
        
        for (int i = 0; i < n; i++) {
            numero[i] = i;
            somma = somma + numero[i];
        }
        System.out.println("La somma dei valori del vettre e' di " + somma);
    }
}