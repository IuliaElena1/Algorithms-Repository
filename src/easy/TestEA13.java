package easy;

import java.util.Arrays;

public class TestEA13 {

	/*
	 * Scrieti intr-o clasa numita TestEA12 o metoda care primeste un ca parametru
	 * un sir de numere si gaseste tripleta de numere consecutive din acest sir a
	 * caror suma este maxima si o returneaza. Daca sirul contine mai putin de 4
	 * numere metoda returneaza suma lor.
	 */

	public static int getMaxTriple(int[] arr) {

		if (arr.length == 0) {
			return 0;
		}

		int minimArrSum = 0;
		if (arr.length < 3) {
			for (int element : arr) {
				minimArrSum = minimArrSum + element;
			}
			return minimArrSum;
		}

		int max = arr[0];
		int[] sumTriplets = arrayOfTripletsSum(arr);
		for (int i = 0; i < sumTriplets.length; i++) {
			if (max < sumTriplets[i]) {
				max = sumTriplets[i];

			}
		}

		return max;

	}

	private static int[] arrayOfTripletsSum(int[] arr) {

		int[] sum = new int[arr.length - 2];
		int sumIndex = 0;

		for (int i = 0; i < arr.length - 2; i++) {
			sum[sumIndex] = arr[i] + arr[i + 1] + arr[i + 2];
			sumIndex++;

		}
		return sum;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 8, 10, 5, 13, 9 };
		System.out.println("Sum of triplets" + Arrays.toString(arrayOfTripletsSum(arr)));

		System.out.println(getMaxTriple(arr)); // 28
	}

}
