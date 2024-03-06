package java04;

public class J_01_While_Loop {

	public static void main(String[] args) {
		// while
		// #1
		int a = 1;

		while (a <= 10) {
			System.out.println(a);
			a++;
		}

		// #2
		int b = 10;

		while (b > 0) {
			if (b % 2 == 0) {
				System.out.println("Even: " + b);
			} else {
				System.out.println("Odd: " + b);
			}
			b--;
		}

		// do-while
		int c = 10;

		do {
			System.out.println(c);
			c++;
		} while (c <= 5);
	}

}
