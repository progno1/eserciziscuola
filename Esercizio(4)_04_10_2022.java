/******************************************************************************

4)  Dato un vettore di N elementi, determinare se ciascun elemento è pari o dispari.

*******************************************************************************/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Di quanti elementi vuoi creare il vettore : ");
        int n = input.nextInt();
        int numero []= new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il numero da verificare se pari o dispari: ");
            numero[i] = input.nextInt();
            if(numero[i]%2==0){
                System.out.println("Il numero e' pari ");
                } else {
                    System.out.println("Il numero e' dispari");
                }
        }
    }
}