package java11;

class Parent {
	String p = "Parent";

	void methodP() {
		System.out.println(p);
	}
}

class ChildA extends Parent {
	String a = "ChildA";

	void methodA() {
		System.out.println(a);
	}
}

class ChildB extends Parent {
	String b = "ChildB";

	void methodB() {
		System.out.println(b);
	}
}

public class J_02_Hierachy {

	public static void main(String[] args) {
		ChildA aObj = new ChildA();

		System.out.println(aObj.p);
		System.out.println(aObj.a);

		aObj.methodP();
		aObj.methodA();

		ChildB bObj = new ChildB();

		System.out.println(bObj.p);
		System.out.println(bObj.b);

		bObj.methodP();
		bObj.methodB();
	}

}
