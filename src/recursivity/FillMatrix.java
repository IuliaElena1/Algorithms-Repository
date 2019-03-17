package recursivity;

public class FillMatrix {
	/*
	 * Scrieti intr-o clasa numita TestME3 o metoda care umple un contur intr-o
	 * matrice de 0 si 1. Metoda primeste ca si parametru o matrice de int si doua
	 * coordonate in aceasta, x si y. In aceasta matrice 1 reprezinta "pereti", 0
	 * reprezinta "spatii". Pornind de la punctul cu coordonatele x, y se va umple
	 * spatiul inchis de "pereti" cu numarul 2 si se va returna matricea rezultat.
	 * Daca punctul de inceput este pe un "perete" matricea ramane neschimbata.
	 */

	static int[][] matrix = //
			{ { 0, 0, 1, 0, 0, 0, 1 }, //
					{ 0, 0, 1, 0, 1, 0, 1 }, //
					{ 1, 1, 1, 0, 1, 0, 1 }, //
					{ 0, 1, 0, 0, 1, 0, 1 }, //
					{ 0, 1, 1, 1, 1, 0, 0 }, //
					{ 0, 0, 0, 1, 0, 1, 1 }, //
					{ 0, 0, 0, 1, 0, 0, 0 } //
			};

	public static void showMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);

			}
			System.out.println();

		}

	}

	public static void fill(int[][] matrix, int x, int y) {

		if (x < 0 || y < 0 || x >= matrix.length || y >= matrix.length) { // x,y< 0 : in afara peretelui
																			// x,y >=matrix.lenght : in afara peretelui
			return;
		}

		if (matrix[x][y] != 0) {
			return;
		}

		matrix[x][y] = 5; // matricea primeste valoarea 5 pe coodonatele de mai jos
		fill(matrix, x - 1, y);
		fill(matrix, x + 1, y);
		fill(matrix, x, y - 1);
		fill(matrix, x, y + 1);

	}

	public static void main(String[] args) {

		showMatrix(matrix);
		fill(matrix, 3, 3);
		System.out.println();
		showMatrix(matrix);
	}

}
