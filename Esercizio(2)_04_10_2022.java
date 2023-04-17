/******************************************************************************

2)  Costruire un vettore di N posizioni, inserendo in ogni elemento il valore del suo indice. 

*******************************************************************************/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Di quanti elementi vuoi creare il vettore : ");
        int n = input.nextInt();
        
        int numero []= new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Elemento [" + (i) + "] corrisponde a " + i);
            numero[i] = i;
        }
        
    }
}