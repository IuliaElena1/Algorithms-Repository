package Basic;

public class TestBA10 {
	/*Scrieti intr-o clasa numita TestBA10 o metoda care primeste ca parametru o matrice patratica si returneaza suma elementelor de pe diagonala
	secundara

	getSecondaryDiagonalSum({ {6,3,9}, {4,-8,2}, {4,7,1} }) => 5  
	
	00 01 02 
	10 11 12
	20 21 22
	
	*/

	 public static int getSecondaryDiagonalSum(int[][] matrix) {
		 int sum=0;
		 for (int i=0,j=matrix.length-1-i ; i< matrix.length; i++,j--) {
			 sum=sum + matrix[i][j];
		 }
		 
		return sum;
		 
	 }
	 public static void main(String[] args) {
		 int [][]  matrix =  {{6,3,9}, {4,-8,2}, {4,7,1}} ;
		System.out.println(getSecondaryDiagonalSum(matrix));
	}
	
}
