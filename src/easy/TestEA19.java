package easy;

public class TestEA19 {

	public static boolean isSudokuLine(int[] arr) {

		int[] newResult = new int[arr.length];

		for (int i = 1; i < newResult.length; i++) {
			for (int j = i + 1; j < newResult.length - 1; j++) {

				if (arr[i] == arr[j]) {
					return false;

				}
				if (arr[i] == 0) {

				}
			}
		}

		return true;

	}

	public static void main(String[] args) {
		int[] arr = { 0, 0, 3, 0, 1, 0, 7, 0, 0 };
		System.out.println(isSudokuLine(arr));
	}
}
