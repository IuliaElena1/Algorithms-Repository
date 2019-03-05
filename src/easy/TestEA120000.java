package easy;

public class TestEA120000 {
	/* Scrieti intr-o clasa numita TestEA12 o metoda care primeste un ca parametru un sir de numere arr si un numar 
	  * intreg pos ce reprezinta o pozitie din sir si returneaza un sir de dimensiune arr.length - 1 rezultat din 
	  * eliminarea elementului de pe pozitia pos. Daca pozitia este in afara sirului se va returna null
	  
	  removePosition( {5, 8, 11, 3, 6}, 0 ) -> {8, 11, 3, 6}
	  removePosition( {5, 8, 11, 3, 6}, 4 ) -> {5, 8, 11, 3}
	  */

	  public static int[] removePosition(int[] arr, int pos) {
	    int[] result = new int[arr.length - 1];
	    int indexResult = 0;

	    for (int i = 0; i < result.length; i++) {
	      // result[arr.length - pos - 1] = arr[i];

	      arr[pos] = arr[pos + 1];
	      arr[pos + 2] = arr[arr.length - 1];

	      // arr[arr.length-1] = arr[i];

	    }

	    return null;

	  }

	  public static void main(String[] args) {

	    int[] arr = { 5, 8, 11, 3, 6 };
	  //  System.out.println(Arrays.toString(removePosition(arr, 2)));
	  }
	}



