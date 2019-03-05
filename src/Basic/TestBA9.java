package Basic;

public class TestBA9 {
	/*
	 * Scrieti intr-o clasa numita TestBA9 o metoda care primeste ca parametru o
	 * matrice patratica si returneaza suma elementelor de pe diagonala principala
	 * 
	 */

	// 1 2 3 i   j 0 0
	// 4 5 6 i   j 2 2   
	// 2 3 5 i   j 3 3   
	public static int getDiagonalSum(int[][] matrix) {

		int sum = 0;
		for (int i = 0,j=0; i < matrix.length; i++,j++) {
		
				if (i == j) {
					sum += matrix[i][j];

				}
			}
		

		return sum;

	}

	public static void main(String[] args) {
		System.out.println(getDiagonalSum(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 2, 3, 5 } }));
	}
}
