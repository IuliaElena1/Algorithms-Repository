package easy;

import java.util.Arrays;

public class TestEA17 {
<<<<<<< Upstream, based on origin/master
  /*
  Scrieti intr-o clasa numita TestEA17 o metoda care primeste ca parametru un sir de numere ordonat crescator,
   elimina duplicatele si returneaza sirul rezultat.
  
  Semnatura metodei este:*/
=======
	/*
	 * Scrieti intr-o clasa numita TestEA17 o metoda care primeste ca parametru un
	 * sir de numere ordonat crescator, elimina duplicatele si returneaza sirul
	 * rezultat.
	 * 
	 * Semnatura metodei este:
	 */
>>>>>>> b9ebb81 .

<<<<<<< Upstream, based on origin/master
  public static int[] removeDuplicates(int[] arr) {
    int[] result = new int[arr.length - countDuplicates(arr)];
=======
	public static int[] removeDuplicates(int[] arr) {
>>>>>>> b9ebb81 .

<<<<<<< Upstream, based on origin/master
    int index = 0;
    // result[index] = arr[0];
=======
		int[] result = new int[arr.length - countDuplicates(arr)];

		int index = 0;

		for (int i = 1; i < arr.length - 1; i++) {

			if (arr[i] < arr[i + 1]) {
				result[index] = arr[i];
				index++;
			}

		}
		result[result.length - 1] = arr[arr.length - 1];
>>>>>>> b9ebb81 .

    for (int i = 0; i < arr.length - 1; i++) {

      if (arr[i] < arr[i + 1]) {
        result[index] = arr[i];
        index++;
      }

<<<<<<< Upstream, based on origin/master
    }
    return result;

  }

  public static int countDuplicates(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] == arr[i + 1]) {
        count++;
      }
    }
    return count;

  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(removeDuplicates(new int[] { 1, 1, 2, 2, 3, 3, 3, 3 })));
    System.out.println("Count duplicates= " + countDuplicates(new int[] { 1, 1, 2, 2, 3, 3, 3, 3 }));
  }

}
=======
	public static int countDuplicates(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeDuplicates(new int[] { 1, 1, 2, 2, 3, 3, 3, 3 })));
		System.out.println("Count duplicates= " + countDuplicates(new int[] { 1, 1, 2, 2, 3, 3, 3, 3 }));
	}

}
>>>>>>> b9ebb81 .
