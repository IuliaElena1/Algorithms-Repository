package Basic;

public class TestBA3 {

	/*Scrieti intr-o clasa numita TestBA3 o metoda care primeste ca parametru un numar si returneaza factorialul lui (n!).

	Factorialul unui numar n este produsul tuturor numerelor de la 1 pana la n. (n! = 1 x 2 x 3 x .... x n)

	 Factorialul lui 0 este 1, deci pentru n = 0 metoda trebuie sa returneze 1

	Factorialul unui numar n este produsul tuturor numerelor de la 1 pana la n. (n! = 1 x 2 x 3 x .... x n)*/


	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
	 public static int factorial(int n) {
		 if( n == 0) {  //base case
			 return 1;
		 }
		 return n * factorial(n-1);
		 
	 }
}
