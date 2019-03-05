package Easy;

public class TestEA11 {

	  /*Scrieti intr-o clasa numita TestEA11 o metoda care primeste un ca parametru un sir de numere si returneaza 
	  true daca nu exista elemente duplicate in sir si false in caz contrar.
	  
	  Semnatura metodei este:
	  */
	  //isUnique( {8, 2, 7, 8, 3, 5} ) -> false
	  //isUnique( {} ) -> true

	  public static boolean isUnique(int[] arr) {

	    for (int i = 0; i < arr.length; i++) {

	      if (arr[i] == arr[arr.length - 1 - i]) {
	        return false;
	      }
	    }

	    return true;

	  }

	  public static void main(String[] args) {
	    int[] arr = {};

	    System.out.println(isUnique(arr));
	    System.out.println(isUnique(new int []{8, 2, 7, 8, 3, 5}));
	    System.out.println(isUnique(new int []{8, 2, 7, 8, 2, 5}));

	  }
}
