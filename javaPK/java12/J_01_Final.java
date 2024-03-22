package java12;

final class ParentFinal {
	final int var = 10;

	final void method() {
		System.out.println("Parent");
	}

}

// * The type ChildFinal cannot subclass the final class ParentFinal
// class ChildFinal extends Parent {

// // * Cannot override the final method from Parent
// void method() {
// System.out.println("Child");
// }

// }

public class J_01_Final {

	public static void main(String[] args) {
		ParentFinal obj = new ParentFinal();

		// * Cannot override the final method from Parent
		// obj.var = 13;

		System.out.println(obj.var);

		obj.method();
	}

}
