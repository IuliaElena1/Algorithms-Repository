package Basic;

public class TestBA4 {

/*	Scrieti intr-o clasa numita TestBA4 o metoda care primeste ca parametru un sir de numere si returneaza cel mai mare numar din sir.
 *  Se considera ca sirul de intrare are minim un element.

*/
	public static void main(String[] args) {
		int[] sir = {23,567,43,2,667,1000,2346};
		System.out.println(max(sir));
	}
	 public static int max(int[] sir) {
		 int max = 0;
		 for(int element : sir) {
			 if(element > max) {
				 max=element;
			 }
			 
		 }
		 
		return max;
		 
	 }
	 
}
