package easy;

public class TestEA21 {

	/*
	 * Scrieti intr-o clasa numita TestEA21 o metoda care primeste ca parametru doua
	 * String-uri word si letters si returneaza un alt String format astfel: Daca
	 * litera de pe pozitia i in word se regaseste in String-ul letters atunci va
	 * aparea pe aceeasi pozitie in rezultat. Altfel pe pozitia respectiva va aparea
	 * caracterul "_". Spatiile goale nu se modifica iar daca sunt parte din sirul
	 * letters vor fi ignorate. Caracterele acceptate in cele doua string-uri sunt
	 * 'a'-'z', respectiv 'A'-'Z'. In caz ca apar alte caractere metoda returneaza
	 * null. Comparatiile intre caractere nu vor fi case sensitive, deci 'A' si 'a'
	 * se vor trata la fel, dar in rezultat caracterele vor aparea conform valorii
	 * din string-ul word.
	 * 
	 * hangman("collections", "eio") -> "_o__e__io__" hangman("", "abc") -> ""
	 * hangman("abc", "")-> "___" hangman("coll,ections", "eio") -> null
	 * 
	 */
	public static String hangman(String word, String letters) {
		return letters;

	}
}
