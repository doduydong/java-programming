package java07;

public class J_01_Class_Object {
	String eID;
	String eName;
	String eRole;
	int eSalary;

	void employeeInfo() {
		System.out.println(eID + " - " + eName + " - " + eRole + " - " + eSalary);
	}

	public static void main(String[] args) {
		J_01_Class_Object tester = new J_01_Class_Object();
		tester.eID = "AFC01";
		tester.eName = "John";
		tester.eRole = "QAE";
		tester.eSalary = 1200;
		tester.employeeInfo();

		J_01_Class_Object sdet = new J_01_Class_Object();
		sdet.eID = "AFC02";
		sdet.eName = "Dong";
		sdet.eRole = "SDET";
		sdet.eSalary = 2800;
		sdet.employeeInfo();
	}

}
