package java03;

public class J_01_Arithmetic {

	public static void main(String[] args) {
		// Arithmetic operators are used to perform common mathematical operations

		int a = 13, b = 10;

		System.out.println("Addition: " + (a + b));
		System.out.println("Subtraction: " + (a - b));
		System.out.println("Multiplication: " + (a * b));
		System.out.println("Division: " + (a / b));
		System.out.println("Modulus: " + (a % b));

		// (++) and (--) Increases / Decreases the value of a variable by 1

		int postInc = a++; // post-increment

		System.out.println(postInc);
		System.out.println(a);

		int preDec = --b; // pre-decrement

		System.out.println(preDec);
		System.out.println(b);
	}

}
