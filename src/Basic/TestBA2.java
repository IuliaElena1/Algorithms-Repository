package Basic;

public class TestBA2 {
	/*Scrieti intr-o clasa numita TestBA2 o metoda care primeste ca parametru un sir de numere intregi si returneaza cate numere negative
	(mai mici decat 0) exista in sir.

	countNegatives(new int[] {10, 14, -21, -4, 0, 2, -3}) -> 3
	Semnatura metodei este:*/

	public static void main(String[] args) {
		
		int[] sir = {10, 14, -21, -4, 0, 2, -3};
		System.out.println("NR elemente negative din sir : " + countNegatives(sir));
	}
	
	
	 public static int countNegatives(int[] sir) {
		 int count=0;
		 for(int element: sir) {
			 if(element<0) {
				 count++;
			 }
		 }
		return count;
		 
		 
	 }
}
