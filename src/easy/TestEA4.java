package Easy;

public class TestEA4 {
	
	/*Scrieti intr-o clasa numita TestEA4 o metoda care primeste doua numere pozitive intregi ca parametru, a si b si returneaza 
	cel mai mic multiplu comun al celor doua. Cel mai mic multiplu comun (cmmmc) este cel mai mic numar care se imparte exact la ambele numere.*/


	 public static int cmmmc(int a, int b) {
		 if( a == b) {
			 return a;
		 }
		return b;
		 
		 }
		
		 
	 public static void main(String[] args) {
		System.out.println(cmmmc(2,5));
	}

}
