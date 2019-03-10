package easy;

import java.util.Arrays;

public class TestEA17 {
	/*
	 * Scrieti intr-o clasa numita TestEA17 o metoda care primeste ca parametru un
	 * sir de numere ordonat crescator, elimina duplicatele si returneaza sirul
	 * rezultat.
	 */

	public static int[] removeDuplicates(int[] arr) {
		int[] result = new int[arr.length];
		int indexResult = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			// for (int j = 1; j < arr.length - 1; j++) {
			if (arr[i] != arr[i + 1]) {
				result[indexResult] = arr[i];
				indexResult++;
			}
		}

		return result;

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeDuplicates(new int[] { 1, 1, 2, 2, 2, 3, 3, 3, 3 })));
	}
}
