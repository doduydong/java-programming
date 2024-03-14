package java08;

public class J_02_Constructors {
	String eID;
	String eName;
	String eRole;
	int eSalary;

	void employeeInfo() {
		System.out.println(eID + " - " + eName + " - " + eRole + " - " + eSalary);
	}

	public J_02_Constructors() {
		eID = "AFC01";
		eName = "John";
		eRole = "QAE";
		eSalary = 1200;
	}

	public J_02_Constructors(String id, String name, String role, int salary) {
		eID = id;
		eName = name;
		eRole = role;
		eSalary = salary;
	}

}
