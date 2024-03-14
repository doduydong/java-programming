package java08;

public class J_00_Testing {

	public static void main(String[] args) {
		// Methods
		J_01_Methods greeting = new J_01_Methods();

		greeting.method1();

		System.out.println(greeting.method2());

		greeting.method3("Dong");

		System.out.println(greeting.method4("Dong"));

		// Constructors
		J_02_Constructors employee1 = new J_02_Constructors();

		employee1.employeeInfo();

		J_02_Constructors employee2 = new J_02_Constructors("AFC02", "Dong", "SDET", 2800);

		employee2.employeeInfo();
	}

}
