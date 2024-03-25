package java13;

interface Shape {
	// final & static
	int width = 10, length = 20;

	// abstract method
	void circle();

	// default method
	default void square() {
		System.out.println("Square");
	}

	// static method
	static void rectangle() {
		System.out.println("Rectangle");
	}
}

public class J_01_Interface_Demo implements Shape {
	int x = 1, y = 2;

	void triangle() {
		System.out.println("Triangle");
	}

	@Override
	public void circle() {
		System.out.println("Circle");
	}

	public static void main(String[] args) {
		J_01_Interface_Demo obj1 = new J_01_Interface_Demo();

		Shape obj2 = new J_01_Interface_Demo();

		obj1.circle();

		obj1.square();

		obj1.triangle();

		System.out.println(obj1.x * obj1.y);

		obj2.circle();

		obj2.square();

		Shape.rectangle();

		System.out.println(Shape.width * Shape.length);
	}

}
