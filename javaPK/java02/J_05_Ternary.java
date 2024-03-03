package java02;

public class J_05_Ternary {

	public static void main(String[] args) {
		// A short-hand If...else
		// variable = (condition) ? expressionTrue : expressionFalse;

		int age = 26;

		String message = (age >= 18) ? "Access granted!" : "Access denied!";

		System.out.println(message);
	}

}
