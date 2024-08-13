package java04;

public class J_01_If_Else {

	public static void main(String[] args) {
		int age = 26;

		if (age >= 18) {
			System.out.println("Access granted!");
		} else {
			System.out.println("Access denied!");
		}

		int a = 10, b = 20, c = 30;

		if (a > b && a > c) {
			System.out.println(a + " is the largest number");
		} else if (b > c) {
			System.out.println(b + " is the largest number");
		} else {
			System.out.println(c + " is the largest number");
		}
	}

}
