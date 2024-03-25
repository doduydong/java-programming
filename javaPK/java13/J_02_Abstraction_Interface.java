package java13;

public class J_02_Abstraction_Interface extends AbstractClass implements Interface1, Interface2 {

	@Override
	void method1() {
		System.out.println(a);
	}

	@Override
	public void method3() {
		System.out.println(c);
	}

	@Override
	public void method4() {
		System.out.println(d);
	}

	public static void main(String[] args) {
		J_02_Abstraction_Interface obj = new J_02_Abstraction_Interface();

		obj.method1();

		obj.method2();

		obj.method3();

		obj.method4();
	}

}
