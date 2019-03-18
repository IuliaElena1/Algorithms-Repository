
package work;

import java.util.ArrayList;
import java.util.List;

public class Labirint {

	static int[][] matrix = { //
			{ 0, 0, 1, 0, 0, 0, 1 }, //
			{ 0, 0, 0, 0, 1, 0, 1 }, //
			{ 0, 1, 1, 0, 1, 0, 1 }, //
			{ 0, 1, 0, 0, 1, 0, 1 }, //
			{ 0, 1, 1, 1, 1, 0, 0 }, //
			{ 0, 0, 0, 0, 0, 0, 1 }, //
			{ 0, 1, 1, 1, 1, 0, 0 } //

	};

	public static void main(String[] args) {
		showMatrix();

		labirint(matrix, new Point(0, 0), new Point(6, 6));
		System.out.println();
		showMatrix();
	}

	private static void showMatrix() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				System.out.print((matrix[i][j]));
			}
			System.out.println();
		}
	}

	static List<Point> curentSolution = new ArrayList<>();

	private static void labirint(int[][] matrix, Point start, Point finish) {
		// evitam nodurile unde nu puteam merge
		if (start.x < 0 || start.y < 0 || start.x >= matrix.length || start.y >= matrix.length) {
			return;
		}

		// conditia este 0 oricand mergi pe un spatiu gol
		if (matrix[start.x][start.y] != 0) {
			return;
		}
		// evitam buclele
		if (curentSolution.contains(start)) {
			return;
		}

		// adaugam nodul curent la solutie
		curentSolution.add(start);

		// daca am ajuns la solutie o afisam
		if (start.equals(finish)) {
			System.out.println(curentSolution);

			// stergem nodul curent din solutie
			curentSolution.remove(curentSolution.size() - 1);
			return;
		}

		// apelam recursiv pt fiecare vecin
		labirint(matrix, new Point(start.x, start.y - 1), finish);
		labirint(matrix, new Point(start.x, start.y + 1), finish);
		labirint(matrix, new Point(start.x - 1, start.y), finish);
		labirint(matrix, new Point(start.x + 1, start.y), finish);
		// stergem nodul curent din solutie
		curentSolution.remove(curentSolution.size() - 1);

	}
}
