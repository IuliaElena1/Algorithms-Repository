package easy;

public class TestEA20 {
	/*
	 * Scrieti intr-o clasa numita TestEA20 o metoda care primeste ca parametru o
	 * matrice de 3x3 numere intre 0 si 9 si verifica daca matricea respectiva este
	 * sau nu valida conform regulilor Sudoku (sa nu existe in ea dubluri pentru
	 * numerele intre 1 si 9. Doar 0 poate exista de mai multe ori semnificand o
	 * casuta necompletata). Daca matricea de intrare are alta dimensiune decat 3 x
	 * 3 sau contine si alte cifre in afara de 0-9 metoda va returna false.
	 * 
	 * Semnatura metodei este:
	 */

	public static boolean sudokuChecker(int[][] matrix) {

		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix.length - 1; j++) {
				/*
				 * if (matrix[i][j] == 0) {
				 * 
				 * }
				 */
				if (matrix[i][j] == matrix[i][j + 1] && matrix[i][j] == matrix[i + 1][j]) {
					return false;
				}

			}

		}

		return true;

	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 0 }, { 4, 5, 0 }, { 2, 0, 9 } };

		System.out.println(sudokuChecker(matrix));
	}
}
