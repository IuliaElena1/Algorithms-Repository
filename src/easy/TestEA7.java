package easy;

import java.util.Arrays;

public class TestEA7 {

	/*
	 * Scrieti intr-o clasa numita TestEA7 o metoda care primeste un sir de numere
	 * intregi pozitive ca parametru si un numar n si returneaza al n-lea cel mai
	 * mic numar din sir. Daca n este mai mare decat lungimea sirului metoda
	 * returneaza -1.
	 * 
	 * :
	 */
	// nthSmallest({6,8,2,1,4,9}, 3) -> 4

	public static int nthSmallest(int[] sir, int n) {

		sortArray(sir);
		int nthSmallest = sir[n-1];

		return nthSmallest;

	}

	private static int[] sortArray(int[] sir) {
		boolean isSorted = true;
		int j = 0;

		while (isSorted) {
			isSorted = false;
			j++;

			for (int i = 0; i < sir.length - j; i++) {

				if (sir[i] > sir[i + 1]) {
					int temp = sir[i + 1];
					sir[i + 1] = sir[i];
					sir[i] = temp;
					isSorted = true;

				}
			}
		}
		return sir;
	}

	public static void main(String[] args) {
		int[] sir = { 6, 8, 2, 1, 4, 9 };
		System.out.println("Array sorted " + Arrays.toString(sortArray(sir)));
		 System.out.println( "thSmallest " +nthSmallest(sir,5));
	}

}
