package Easy;

public class TestEA5 {

	/*
	 * Scrieti intr-o clasa numita TestEA5 o metoda care primeste doua numere
	 * pozitive intregi ca parametru, a si b si returneaza cel mai mare divizor
	 * comun al celor doua. Cel mai mare divizor comun (cmmdc) este cel mai mare
	 * numar la care se impart exact cele doua.
	 * 
	 * :
	 */

	public static int cmmdc(int a, int b) {

		int multipluDeA = a;
		int multipluDeB = b;

		while(multipluDeA != multipluDeB)
		{
			if(multipluDeA < multipluDeB)
			{
				multipluDeA += a;
			}
			else
			{
				multipluDeB += b;
			}
		}

		return multipluDeA;
	}

	public static void main(String[] args) {
		System.out.println(cmmdc(2, 5));
	}

}
