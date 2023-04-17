/******************************************************************************

1)  Costruire un vettore di N elementi con valori letti da tastiera e visualizzarli

*******************************************************************************/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Numero di elementi da inserire : ");
        int n = input.nextInt();
        
        int numero []= new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il numero " + (i + 1) + ": ");
            numero[i] = input.nextInt();
        }
        
    }
}