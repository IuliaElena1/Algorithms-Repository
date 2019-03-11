package easy;

public class TestEA11 {

  /*Scrieti intr-o clasa numita TestEA11 o metoda care primeste un ca parametru un sir de numere si returneaza 
  true daca nu exista elemente duplicate in sir si false in caz contrar.
  
  Semnatura metodei este:
  */
  //isUnique( {8, 2, 7, 8, 3, 5} ) -> false
  //isUnique( {} ) -> true

  public static boolean isUnique(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {

        if (arr[i] == arr[j]) {
          return true;
        }
      }
    }

    return false;

  }

  public static void main(String[] args) {
    int[] arr = {};
    System.out.println(isUnique(arr));
    System.out.println(isUnique(new int[] { 8, 2, 7, 9, 3, 5 }));
    System.out.println(isUnique(new int[] { 8, 3, 7, 9, 3, 5 }));

  }
}
