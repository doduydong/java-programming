package java10;

public class J_00_Testing {

	public static void main(String[] args) {
		System.out.println(J_02_Static.staticVar);

		J_02_Static.staticMethod();

		J_02_Static staticObj = new J_02_Static();

		staticObj.method();
	}

}
