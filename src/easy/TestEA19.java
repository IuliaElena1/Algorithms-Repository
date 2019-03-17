package easy;

public class TestEA19 {
	/*
	 * Scrieti intr-o clasa numita TestEA19 o metoda care primeste ca parametru un
	 * sir de exact 9 numere intre 0 si 9 si verifica daca acest sir poate
	 * reprezenta o linie valida de Sudoku, adica cifrele intre 1 si 9 sa se
	 * gaseasca de maxim o data, iar 0 care simbolizeaza o casuta necompletata poate
	 * sa se regaseasca de oricate ori. Daca sirul are lungime diferita de 9 metoda
	 * returneaza false.
	 * 
	 * isSudokuLine( {1, 2, 3, 4, 5, 6, 7, 8, 9} ) -> true isSudokuLine( {9, 3, 4,
	 * 1, 7, 6, 2, 5, 8} ) -> true isSudokuLine( {0, 0, 3, 0, 1, 0, 7, 0, 0} ) ->
	 * true
	 * 
	 */

	/*
	 * Scrieti intr-o clasa numita TestEA19 o metoda care primeste ca parametru un
	 * sir de exact 9 numere intre 0 si 9 si verifica daca acest sir poate
	 * reprezenta o linie valida de Sudoku, adica cifrele intre 1 si 9 sa se
	 * gaseasca de maxim o data, iar 0 care simbolizeaza o casuta necompletata poate
	 * sa se regaseasca de oricate ori. Daca sirul are lungime diferita de 9 metoda
	 * returneaza false.
	 * 
	 * isSudokuLine( {1, 2, 3, 4, 5, 6, 7, 8, 9} ) -> true isSudokuLine( {9, 3, 4,
	 * 1, 7, 6, 2, 5, 8} ) -> true isSudokuLine( {0, 0, 3, 0, 1, 0, 7, 0, 0} ) ->
	 * true
	 * 
	 */

	public static boolean isSudokuLine(int[] arr) {

		int[] newResult = removeZeroElement(arr);
		// System.out.println(newResult);

		if (newResult.length + zeroDuplicate(arr) != 9) {
			return false;
		}

		for (int i = 1; i < newResult.length; i++) {
			for (int j = i + 1; j < newResult.length - 1; j++) {

				if (arr[i] == arr[j]) {
					return false;

				}
			}
		}

		return true;

	}

	public static int[] removeZeroElement(int[] arr) {

		int[] result = new int[arr.length - zeroDuplicate(arr)];
		int indexResult = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				result[indexResult] = arr[i];
				indexResult++;

			}

		}
		return result;

	}

	private static int zeroDuplicate(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 0, 3, 0, 1, 0, 7, 0, 0 };
		System.out.println(isSudokuLine(arr));
	}
}
