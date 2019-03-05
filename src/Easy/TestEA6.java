package Easy;

import java.util.Arrays;

public class TestEA6 {

	/*Scrieti intr-o clasa numita TestEA6 o metoda care primeste un numar intreg pozitiv ca parametru u, a si b si returneaza un
	sir de int cu cifrele numarului.
*/
	
     //intToArray(120) -> {1,2,0}
	 public static int[] intToArray(int n) {
		 int [] array = new int [countDigit(n)];
		 
		 while(n>0) {
		 for(int i=0 ; i<array.length;i++ ) {
			 array[array.length-1-i] = n % 10;
			 n /=10;
		 }
		 }
		  
		return  array;
		 
	 }

	private static int countDigit(int n) {
		int count =0;
		while(n>0) {
		n /= 10;
		count++;}
		return count;
	}
	
	public static void main(String[] args) {
		//System.out.println(countDigit(123));
		System.out.println(Arrays.toString(intToArray(1233453)));
	}
}
