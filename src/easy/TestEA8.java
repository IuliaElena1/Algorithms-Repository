package easy;

public class TestEA8 {
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

	// contains({1, 2, 3, 4, 2, 1, 3, 4} = a , {2, 3, 4} = b) -> true

	public static boolean contains(int[] a, int[] b) {
		int bIndex = 0;
		for (int i = 0; i < a.length; i++) {
			if (b[bIndex] == a[i]) {
				bIndex++;

				if (bIndex == b.length) {
					return true;
				}

			}
		}

		return false;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 2, 1, 3, 4 };
		int[] b = { 1, 1, 4 };

		System.out.println(contains(a, b));

	}
}
