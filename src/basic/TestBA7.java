package basic;

public class TestBA7 {
/*	Scrieti intr-o clasa numita TestBA7 o metoda care primeste ca parametru un sir de numere pozitive si un numar n si 
	returneaza prima pozitie din sir unde se gaseste numarul n. Daca numarul nu se regaseste in sir metoda va returna -1.


   ex: ({1, 2, 3, 8, 7, 8}, 8) -> 3
	Semnatura metodei este:*/

	 public static int find(int[] sir, int n) {
	
		  for(int i=0 ; i< sir.length ;i ++) {
			  if(sir[i]==n) {
				 return i;
			  }
		  }
		return -1;
		 
	 }
	 
	 public static void main(String[] args) {
		 
		System.out.println(find(new int [] {1,2,3,8,7,8},8));
	}
}
