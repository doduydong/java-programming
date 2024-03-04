package java03;

public class J_01_If_Else {

	public static void main(String[] args) {
		// if
		int age = 26;

		if (age >= 18) {
			System.out.println("Access granted!");
		}

		// if-else
		int number = 10;

		if (number % 2 == 0) {
			System.out.println(number + " is even number");
		} else {
			System.out.println(number + " is odd number");
		}

		// else-if
		int A = 10, B = 20, C = 30;

		if (A > B && A > C) {
			System.out.println(A + " the largest number");
		} else if (B > C) {
			System.out.println(B + " the largest number");
		} else {
			System.out.println(C + " the largest number");
		}
	}

}
