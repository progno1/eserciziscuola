/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Auto ferrari = new Auto ("Ferrari","F22",2010,100);
		ferrari.Print();
		
		Moto ducati = new Moto ("Ducati","fighissima",2020,100);
		ducati.Print();
		System.out.println(Calcolatrice.somma(3,2,3,4));
	}
	
}
