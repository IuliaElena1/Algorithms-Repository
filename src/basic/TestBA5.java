package Basic;

public class TestBA5 {
/*	Scrieti intr-o clasa numita TestBA5 o metoda care primeste ca parametru un sir de numere si returneaza produsul numerelor nenule din sir.
	Daca sirul e gol metoda va returna 1. Daca sirul are doar elemente cu valoarea 0 metoda va returna 1.*/

public static void main(String[] args) {
	int[] sir = {2,3,0,0,4};
	System.out.println(product(sir));
}	

	 public static int product(int[] sir) {
		 
		/*
		 * if( sir.length == 0) { return 1; }
		 */
		 
		 int produs=1;
		 for(int element : sir) {
			 if(element != 0) {
			 produs *= element;
		 }
		 
		 
	 }
		return produs;
	 
}
}
