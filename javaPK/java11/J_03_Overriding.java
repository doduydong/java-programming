package java11;

class ParentClass {
	double method() {
		return 0;
	}
}

class ChildClass extends ParentClass {

	// Overriding
	double method() {
		return 11.14;
	}

	// Overloading
	int method(int number) {
		return number;
	}
}

public class J_03_Overriding {

	public static void main(String[] args) {
		ChildClass aObj = new ChildClass();

		System.out.println(aObj.method());

		System.out.println(aObj.method(10));
	}

}
