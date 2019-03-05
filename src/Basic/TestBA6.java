package Basic;

public class TestBA6 {
	/*
	 * Scrieti intr-o clasa numita TestBA6 o metoda care primeste ca parametru un
	 * sir de cifre intre 0 si 9 si returneaza numarul format din ele. Daca sirul e
	 * gol metoda va returna -1. Daca sirul are vreun element care nu apartine
	 * intervalului 0..9 metoda va returna -2.
	 * 
	 */

	// {1,2,3,5} -> 125
	public static int arrayToNumber(int[] sir) {

		if (sir.length == 0) { // sirul este gol
			return -1;
		}

		int n = sir[0];

		for (int i = 0; i < sir.length - 1; i++) {

			if (sir[i] > 9 || sir[i] < 0) {
				return -2;
			}

			n = n * 10 + sir[i + 1];

		}
		return n;
	}

	public static void main(String[] args) {
		int[] sir = { 2, 2, 3, 5 };
		System.out.println(arrayToNumber(sir));
	}
}
