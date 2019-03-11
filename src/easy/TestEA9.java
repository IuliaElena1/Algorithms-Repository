package easy;

public class TestEA9 {
	/*
	 * Scrieti intr-o clasa numita TestEA9 o metoda care primeste ca parametri un
	 * sir de numere intregi unice si un numar n si returneaza cate perechi de cate
	 * doua numere din sir au suma egala cu n.
	 * 
	 */

	// countPairs({ 5, 7, 8, 9, 10, 11, 12, 15 }, 20) -> 3
	//countPairs({ 1, 2, 3 }, 10) -> 0


	public static int countPairs(int[] arr, int n) {
		int count = 0;
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1 ; j < arr.length-1 ; j++) {
				if (arr[i] + arr[j] == n) {
					count++;
				}
			}
		}

		return count;

	}

	public static void main(String[] args) {
	    int[] arr={ 5, 7, 8, 9, 10, 11, 12, 15,3 };
		System.out.println(countPairs(arr, 20));
		System.out.println(countPairs(new  int[] { 1, 2, 3, 5, 7,8 },  10)); 
		
	}
}
