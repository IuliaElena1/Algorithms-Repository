package Basic;

import java.util.Arrays;

public class TestBA8 {
	
	/*Scrieti intr-o clasa numita TestBA8 o metoda care primeste ca parametru un sir de numere si returneaza sirul respectiv 
	inversat.

	*/

	 public static int[] reverse(int[] sir) {
		 int [] reverseSir = new int[sir.length];
		
		 
		 for(int i = 0; i < sir.length ; i++) {
			 
			   reverseSir[sir.length-i-1] = sir[i] ;
			 
			 
		 }
		 
		return reverseSir;
		 
	 }
	 
	 public static void main(String[] args) {
		System.out.println(Arrays.toString(reverse(new int[] {1,3,4,5,6})));
	}

}
