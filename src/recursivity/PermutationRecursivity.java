package recursivity;

import java.util.ArrayList;
import java.util.List;

public class PermutationRecursivity {

	public static String position(String s, int pos) {

		return s.substring(0, pos) + s.substring(pos + 1, s.length());
	}

	public static List<String> permutation(String s) {
		List<String> result = new ArrayList<>();

		if (s.length() == 1) { // cazul de baza
			result.add(s);
			return result;
		}

		for (int i = 0; i < s.length(); i++) {
			String permutation = s.substring(0, i) + s.substring(i + 1, s.length());
			List<String> list = permutation(permutation); // substringul l-am bagat intr-o lista

			char ch = s.charAt(i); // fiecarui element din lista cu permutari i-am adaugat cate un char din string
			for (String element : list) {
				result.add(element + ch);
			}

		}
		return result;

	}

	public static void main(String[] args) {
		System.out.println("Position:  " + position("ABC", 1));
		System.out.println("Position:  " + position("ABC", 2));
		System.out.println("Position:  " + position("ABC", 0));

		System.out.println("\nPermutation");
		System.out.println(permutation("ABC"));

	}
}
