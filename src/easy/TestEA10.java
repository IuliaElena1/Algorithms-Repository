package easy;

public class TestEA10 {
	/*
	 * Scrieti intr-o clasa numita TestEA10 o metoda care primeste un parametru
	 * numeric n >= 0 si returneaza al n-lea element din sirul lui Fibonacci. Daca n
	 * este negativ metoda returneaza -1.
	 */

	public static int fibo(int n) {

		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		return fibo(n - 1) + fibo(n - 2);
	}

	public static void main(String[] args) {

		System.out.println(fibo(4));
	}
}
