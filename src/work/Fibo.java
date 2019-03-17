/*
 * Copyright (c) 2019 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package work;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:isilist@ssi-schaefer-noell.com">isilist</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class Fibo {

	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		}

		return fibo(n - 1) + fibo(n - 2);
	}

	public static List<String> permutari(String s) {
		List<String> result = new ArrayList<String>();

		if (s.length() == 1) {
			result.add(s);
			return result;
		}

		for (int i = 0; i < s.length(); i++) {
			String rest = s.substring(0, i) + s.substring(i + 1, s.length());
			List<String> list = permutari(rest);
			char ch = s.charAt(i);
			for (String element : list) {
				result.add(ch + element);

			}
		}

		return result;

	}

	public static String name(String s, int pos) {

		return s.substring(pos + 1, s.length());

	}

	// de ce nu merge cu minus?
	public static int expresie(String s) {
		int rezultat;

		int position = s.indexOf('+');
		if (position != -1) {
			String left = s.substring(0, position).trim();
			String right = s.substring(position + 1, s.length()).trim();

			return expresie(left) + expresie(right);

		}

		int positionAsterix = s.indexOf("*");
		if (positionAsterix != -1) {

			String leftAstx = s.substring(0, positionAsterix).trim();
			String rightAstx = s.substring(positionAsterix + 1, s.length()).trim();
			return expresie(leftAstx) * expresie(rightAstx);

		}
		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		System.out.println(fibo(3));
		System.out.println(permutari("a"));
		System.out.println(name("ABCD", 2));
		System.out.println(name("ABCD", 3));
		System.out.println(name("ABCD", 0));
		System.out.println(permutari("ABC"));
		System.out.println(expresie("1*4 + 2*3 + 2"));

	}
}
