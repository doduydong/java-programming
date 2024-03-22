package java12;

class Animal {
	String color = "White";

	void eat() {
		System.out.println("Food");
	}
}

class Dog extends Animal {
	String color = "Black";

	void displayColor() {
		System.out.println(color);
		System.out.println(super.color);
	}

	void eat() {
		System.out.println("Meat");
		super.eat();
	}
}

public class J_02_Super {

	public static void main(String[] args) {
		Dog obj = new Dog();

		obj.displayColor();

		obj.eat();
	}

}
