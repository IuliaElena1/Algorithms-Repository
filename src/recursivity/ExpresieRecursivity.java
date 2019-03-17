package recursivity;

public class ExpresieRecursivity {

	public static int evaluate(String expression) {

		int positionAdd = expression.indexOf("+");

		if (positionAdd != -1) { // : dc nu exista "+" in sir position=-1 else position=-1
			String left = expression.substring(0, positionAdd).trim();
			String right = expression.substring(positionAdd + 1, expression.length()).trim();

			return evaluate(left) + evaluate(right);
		}

		int positionDif = expression.indexOf("-");
		if (positionDif != -1) {
			String leftDiference = expression.substring(0, positionDif).trim();
			String rightDiference = expression.substring(positionDif + 1, expression.length()).trim();

			return evaluate(leftDiference) - evaluate(rightDiference);

		}

		int positionMultiply = expression.indexOf("*");
		if (positionMultiply != -1) {
			String leftMultiply = expression.substring(0, positionMultiply).trim();
			String rightMultiply = expression.substring(positionMultiply + 1, expression.length()).trim();

			return evaluate(leftMultiply) * evaluate(rightMultiply);

		}

		return Integer.parseInt(expression);

	}

	public static void main(String[] args) {
		System.out.println(evaluate("3 -2 -1"));
		System.out.println(evaluate("3+2*4-5"));
		System.out.println(evaluate("10*5-7*4"));
		System.out.println(evaluate("100 * 2 + 10 * 4"));
	}

}
