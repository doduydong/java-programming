package java07;

public class J_02_Class_Object {

	public static void main(String[] args) {
		J_01_Class_Object ba = new J_01_Class_Object();
		ba.eID = "AFC03";
		ba.eName = "YuDo";
		ba.eRole = "Business Analyst";
		ba.eSalary = 1600;
		ba.employeeInfo();

		J_01_Class_Object pm = new J_01_Class_Object();
		pm.eID = "AFC04";
		pm.eName = "Higashi";
		pm.eRole = "Project Manager";
		pm.eSalary = 3000;
		pm.employeeInfo();

	}

}
