package lAbirintRecursivNotCompleteYet;

import java.util.ArrayList;
import java.util.List;

import work.Point;

public class Labirint {

	// Gasiti drumul cel mai scurt pornind de la matrix[0][0] pana la matrix [7][7];

	static int[][] matrix = { //
			{ 0, 0, 1, 0, 0, 0, 1 }, //
			{ 0, 0, 0, 0, 1, 0, 1 }, //
			{ 0, 1, 1, 0, 1, 0, 1 }, //
			{ 0, 1, 0, 0, 1, 0, 1 }, //
			{ 0, 1, 1, 1, 1, 0, 0 }, //
			{ 0, 0, 0, 0, 0, 0, 1 }, //
			{ 0, 1, 1, 1, 1, 0, 0 } //

	};

	public static void showMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);

			}
			System.out.println();

		}

	}

	List<Point> currentSolution = new ArrayList<>();

	private static void labirint(int[][] matrix, Point start, Point finish) {

	}

	public static void main(String[] args) {
		labirint(matrix, new Point(0, 0), new Point(6, 6));
		showMatrix(matrix);
	}

}
