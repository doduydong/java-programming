package java11;

class A {
	String a = "Class A";

	void methodA() {
		System.out.println(a);
	}
}

class B extends A {
	String b = "Class B";

	void methodB() {
		System.out.println(b);
	}
}

class C extends B {
	String c = "Class C";

	void methodC() {
		System.out.println(c);
	}
}

public class J_01_Single_Multilevel {

	public static void main(String[] args) {
		A aObj = new A();

		System.out.println(aObj.a);
		aObj.methodA();

		B bObj = new B();

		System.out.println(bObj.a);
		System.out.println(bObj.b);
		bObj.methodA();
		bObj.methodB();

		C cObj = new C();

		System.out.println(cObj.a);
		System.out.println(cObj.b);
		System.out.println(cObj.c);
		cObj.methodA();
		cObj.methodB();
		cObj.methodC();
	}

}
