package easy;

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

	public static int countSums(int[] result) {
		int count = 0;
		int[] arraySum = removeDuplicates(sumArray(result));
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < arraySum.length; j++) {
				if (result[i] == arraySum[j]) {
					count++;
				}
			}
		}

		return count;

	}

	public static int[] removeDuplicates(int[] arraySum) {

		int[] result = new int[arraySum.length - countDuplicates(arraySum)];

		int index = 0;

		for (int i = 1; i < arraySum.length - 1; i++) {

			if (arraySum[i] < arraySum[i + 1]) {
				result[index] = arraySum[i];
				index++;
			}

		}
		result[result.length - 1] = arraySum[arraySum.length - 1];

		return result;

	}

	private static int countDuplicates(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			}
		}
		return count;

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
		System.out.println(countSums(new int[] { 1, 2, 3 }));
		// System.out.println(Arrays.toString(sumArray(new int[] { 1, 1, 2, 3 })));
		// System.out.println(arraySumDimension(new int[] { 1, 1, 2, 3 }));
	}
}
