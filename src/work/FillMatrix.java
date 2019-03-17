/*
 * Copyright (c) 2019 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package work;

/**
 * @author <a href="mailto:isilist@ssi-schaefer-noell.com">isilist</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class FillMatrix {

  static int[][] matrix = { //
    { 0, 0, 1, 0, 0, 0, 1 }, //
    { 0, 0, 1, 0, 1, 0, 1 }, //
    { 1, 1, 1, 0, 1, 0, 1 }, //
    { 0, 1, 0, 0, 1, 0, 1 }, //
    { 0, 1, 1, 1, 1, 0, 0 }, //
    { 0, 0, 0, 1, 0, 1, 1 }, //
    { 0, 0, 0, 1, 0, 0, 0 }//

  };

  public static void main(String[] args) {
    showMatrix();

    fill(matrix, 3, 3);
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

  private static void fill(int[][] matrix, int x, int y) {
    if (x < 0 || y < 0 || x >= matrix.length || y >= matrix.length) {
      return;
    }

    if (matrix[x][y] != 0) {
      return;
    }

    matrix[x][y] = 2;
    fill(matrix, x, y + 1);
    fill(matrix, x - 1, y);
    fill(matrix, x + 1, y);
    fill(matrix, x, y - 1);

  }

}
