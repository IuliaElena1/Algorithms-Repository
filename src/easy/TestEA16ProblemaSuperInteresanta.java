package easy;

import java.util.Arrays;

public class TestEA16ProblemaSuperInteresanta {
	private static int count;

	/*
	 * Scrieti intr-o clasa numita TestEA16 o metoda care primeste ca parametri doua
	 * siruri a si b si returneaza numarul de aparitii al sirului b in sirul a.
	 * 
	 * countAppearances( {1, 2, 3, 2, 3, 4, 1, 2, 4}, {1, 2} ) -> 2
	 * countAppearances( {1, 2, 3, 2, 3, 4, 1, 2, 4}, {1, 2, 3} ) -> 1
	 */

	/*
	 * public static int countAppearances(int[] a, int[] b) { int count =
	 * CountDuplicateApearance(a, b);
	 * 
	 * return a.length < b.length ? (int) count / a.length : (int) count / b.length;
	 * 
	 * }
	 */

	private static int countAppearances(int[] a, int[] b) {

		int[] partOfC = new int[b.length];
		int indexPartC = 0;
		int count = 0;
		for (int i = 0; i < b.length; i++) {

			int[] c = Arrays.copyOfRange(a, i * b.length, b.length * (i + 1));
			System.out.println(Arrays.toString(c));

			partOfC[indexPartC] = c[i];
			indexPartC++;

			if (partOfC != b) {
				// aici as vrea sa ma reintorc la bucla forului ca sa ia urmatorul vector sa il
				// compare

			}

			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 2, 3, 4, 1, 6, 3 };
		int[] b = { 1, 2, 3 };

		System.out.println(countAppearances(a, b));
	}
}