package java13;

public abstract class AbstractClass {
	// final (or non-final)/ static (or non-static)
	int a = 100;

	int b = 200;

	// abstract method
	abstract void method1();

	// non-abstract method
	void method2() {
		System.out.println(b);
	}

}
