package java09;

public class J_01_Polymorphism {

	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(float a, float b) {
		System.out.println(a + b);
	}

	void sum(int a, float b) {
		System.out.println(a + b);
	}

	void sum(float a, int b) {
		System.out.println(a + b);
	}

}
