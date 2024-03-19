package java10;

public class J_02_Static {
	static String staticVar = "Static variable";

	static String nonStaticVar = "Non static variable";

	static void staticMethod() {
		System.out.println("Static method");
	}

	void nonStaticMethod() {
		System.out.println("Non static method");
	}

	void method() {
		System.out.println(staticVar);
		System.out.println(nonStaticVar);
		staticMethod();
		nonStaticMethod();
	}

	public static void main(String[] args) {
		System.out.println(staticVar);

		staticMethod();

		J_02_Static staticObj = new J_02_Static();

		staticObj.method();
	}

}
