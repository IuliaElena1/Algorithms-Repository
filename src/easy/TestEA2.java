package easy;

import java.util.Arrays;

public class TestEA2 {
	/*
	 * Scrieti intr-o clasa numita TestEA2 o metoda care primeste ca parametru un
	 * numar pozitiv intreg n si returneaza true daca numarul respectiv este
	 * palindrom si false in caz contrar. Un numar este palindrom daca citit de la
	 * dreapta la stanga este egal cu el insusi (Ex: 121, 959, 22322, 11, ...)
	 * 
	 */
	// 123 321
	public static boolean isPalindrome(int n) {
		int[] palindrom = numberToArray(n);

		for (int i = 0; i < palindrom.length; i++) {
			if (palindrom[i] != palindrom[palindrom.length - 1 - i]) {

				return false;
			}

		}

		return true;
	}

	public static int[] numberToArray(int n) {
		int[] array = new int[cuntDigits(n)];
		int indexArray = array.length - 1;

		while (n > 0) {

			int r = n % 10;

			array[indexArray] = r;
			indexArray--;

			n /= 10;
		}

		return array;
	}

	private static int cuntDigits(int n) {
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(126721));
		System.out.println(isPalindrome(124421));
	}
}
