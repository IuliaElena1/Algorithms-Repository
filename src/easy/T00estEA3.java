package easy;

public class T00estEA3 {
	/*Scrieti intr-o clasa numita TestEA3 o metoda care primeste ca parametru un numar pozitiv
	intreg n si returneaza true daca numarul respectiv este prim si false in caz contrar.
	Un numar este prim daca se divide doar cu 1 si cu el insusi. Numerele 0, 1 nu se considera
	prime.

	:*/

	 public static boolean isPrime(int n) {
		 if( n ==2) {
			 return true;
		 }
		 
		 for(int i=2; i *i <= n ;i++) {
		   if(n % i == 0) {         //daca scriu n %i !=0 return true care aparent e acelasi lucru nu functioneaza
		return false;}}
		   return true;
		 
	 }
	 
	 public static void main(String[] args) {
		System.out.println(isPrime(9));
	}

	 } 