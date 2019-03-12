package easy;

import java.util.Arrays;

public class TestEA18 {

	/*
	 * Scrieti intr-o clasa numita TestEA18 o metoda care primeste ca parametru un
	 * sir de numere si calculeaza cate dintre ele pot fi exprimate ca suma a altor
	 * doua numere din sir
	 * 
	 * countSums( {1, 2, 3} ) -> 1 //
	 * 
	 * countSums( {1, 2, 3, 4} ) -> 2 //
	 * 
	 * countSums( {1, 1, 2, 3} ) -> 2 //
	 * 
	 * countSums( {0, 1, 1, 2, 3} ) -> 3
	 * 
	 * countSums({} ) -> 0//
	 * 
	 * 
	 */

	public static int countSums(int[] arr) {
		int count = 0;
		int[] arraySum = sumArray(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arraySum.length; j++) {
				if (arr[i] == arraySum[j]) {
					count++;
				}
			}
		}

		return count;

	}

	static int[] isUnique(int[] arr) {
		int[] isUnique = new int[arr.length];
		int index = 0;

		arr = sumArray(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[arr.length - 1 - i]) {
				isUnique[index] = arr[i];
				index++;

			}

		}
		return isUnique;
	}

	public static int[] sumArray(int[] arr) {

		int[] arraySum = new int[arraySumDimension(arr)];
		int indexSum = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1 + i; j < arr.length; j++) {

				arraySum[indexSum] = arr[i] + arr[j];
				indexSum++;
			}

		}
		return arraySum;
	}

	public static int arraySumDimension(int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1 + i; j < arr.length; j++) {

				count++;

			}
		}

		return count;
	}

	public static void main(String[] args) {
		// System.out.println(countSums(new int[] { 1, 1, 2, 3 }));
		// System.out.println(Arrays.toString(sumArray(new int[] { 1, 1, 2, 3 })));
		// System.out.println(arraySumDimension(new int[] { 1, 1, 2, 3 }));
		System.out.println(Arrays.toString(isUnique(new int[] { 1, 1, 2, 3 })));
	}
}
