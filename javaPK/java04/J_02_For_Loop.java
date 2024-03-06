package java04;

public class J_02_For_Loop {

	public static void main(String[] args) {
		// #1
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// #2
		for (int i = 10; i > 0; i--) {
			if (i % 2 == 0) {
				System.out.println("Even: " + i);
			} else {
				System.out.println("Odd: " + i);
			}
		}
	}

}
