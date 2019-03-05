package Easy;

import java.lang.Character.Subset;

public class TestEA1 {

	/*
	 * Scrieti intr-o clasa numita TestEA1 o metoda care primeste ca parametru un
	 * numar pozitiv intreg n si returneaza numarul respectiv inversat. Daca numarul
	 * inversat incepe cu 0 se vor taia zerourile pana la prima cifra diferita de 0.
	 * Daca numarul inversat e 0 metoda returneaza 0.
	 * 
	 */

	public static int reverse(int n) {

		int r = 0;
		while (n > 0) {

			r = r * 10 + n % 10;

			n /= 10;

		}
		return r;

	}

	public static void main(String[] args) {
		System.out.println(reverse(1234));
	}
}
