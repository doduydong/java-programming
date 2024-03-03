package java02;

public class J_01_Arithmetic {

	public static void main(String[] args) {
		// Common mathematical operations

		int a = 13, b = 10;

		System.out.println("Addition: " + (a + b));
		System.out.println("Subtraction: " + (a - b));
		System.out.println("Multiplication: " + (a * b));
		System.out.println("Division: " + (a / b));
		System.out.println("Modulus: " + (a % b));

		// Increment (++) & Decrement (--)
		// Increases/ Decreases the value of a variable by 1

		int A = 11;
		int postI = A++; // post-increment

		System.out.println(postI); // 11
		System.out.println(A); // 12

		int B = 3;
		int preI = ++B; // pre-increment

		System.out.println(preI); // 4
		System.out.println(B); // 4
	}

}
