package easy;

public class TestEA14 {

	/*
	 * Scrieti intr-o clasa numita TestEA14 o metoda care primeste ca parametrii
	 * doua matrici si returneaza suma acestora
	 */

	public static int[][] getMatrixSum(int[][] matrix1, int[][] matrix2) {
		int[][] sumOfMatrix = new int[4][4];
		int indexRow = 0;
		int indexColumn = 0;

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				for (int k = 0; k < matrix2.length; k++) {
					for (int l = 0; l < matrix2.length; l++) {

						sumOfMatrix[indexRow][indexColumn] = matrix1[i][j] + matrix2[k][l];
						indexRow++;
						indexColumn++;
					}

				}
			}
		}

		return sumOfMatrix;

	}

	public static void main(String[] args) {
		int[][] matrix1 = { { 5, 91, 12, 0 }, { 3, 6, 33, 47 }, { 2, 91, 64, 4 }, { 23, 1, 0, 55 } };
		int[][] matrix2 = { { 4, 77, 2, 8 }, { 11, 8, 342, 9 }, { 34, 8, 20, 15 }, { 29, 47, 12, 9 } };

		System.out.println(getMatrixSum(matrix1, matrix2));
	}
}
