package easy;
import java.util.Arrays;

public class TestEA16 {
	private static int count;

	/*
	 * Scrieti intr-o clasa numita TestEA16 o metoda care primeste ca parametri doua
	 * siruri a si b si returneaza numarul de aparitii al sirului b in sirul a.
	 * 
	 * countAppearances( {1, 2, 3, 2, 3, 4, 1, 2, 4}, {1, 2} ) -> 2
	 * countAppearances( {1, 2, 3, 2, 3, 4, 1, 2, 4}, {1, 2, 3} ) -> 1
	 */

	/*
	 * public static int countAppearances(int[] a, int[] b) { int count =
	 * CountDuplicateApearance(a, b);
	 * 
	 * return a.length < b.length ? (int) count / a.length : (int) count / b.length;
	 * 
	 * }
	 */

public static int countAppearances(int[] a, int[] b) {

    int count = 0;

    for (int i = 0; i < a.length; i++) {

      int[] c = Arrays.copyOfRange(a, i, i + b.length);
      System.out.println(Arrays.toString(c));

      if (containsAppearaance(b, c)) {
        count++;
      }
    }

    return count;

  }

  public static boolean containsAppearaance(int[] a, int[] b) {

    int indexB = 0;
    for (int i = 0; i < a.length; i++) {
      if (b[indexB] == a[i]) {
        indexB++;
        if (indexB == b.length) {
          return true;
        }
      }
    }
    return false;

  }

  public static void main(String[] args) {

    int[] a = { 1, 1, 2, 1, 2, 1, 1, 1 };
    int[] b = { 1 };
    System.out.println(countAppearances(a, b));
  }

}
