package easy;

public class TestEA8000 {
	/*
	 * Scrieti intr-o clasa numita TestEA8 o metoda care primeste ca parametri doua
	 * siruri de numere a si b si returneaza true daca elementele lui se regasesc in
	 * a in ordinea
	 * 
	 * aparitiei lor si false in caz contrar.
	 * 
	 * Daca primul sir are lungimea 0 metoda returneaza false. Daca al doilea sir
	 * are lungimea 0 metoda returneaza true.
	 */

	// contains({1, 2, 3, 4, 2, 1, 3, 4}=a , {2, 3, 4}=b) -> true

	public static boolean contains(int[] a, int[] b) {
		int [] c= new int[b.length];
		int indexC=0;

			for (int j = 0; j < b.length; j++) {
				for (int i = 0; i < a.length; i++) {

				if (a[i] == b[j]  ) {
					c[indexC]=b[j];
					indexC++;}
					
					if(c[indexC]==b[j]) {
						return true;
					}
					

				}

			}
		

		return false;

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 1, 9, 8 };
		int[] b = { 2, 4, 3 };

		System.out.println(contains(a, b));
	}
}