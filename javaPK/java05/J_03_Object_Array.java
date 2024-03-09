package java05;

public class J_03_Object_Array {

	public static void main(String[] args) {
		// Declare
		Object[] objArr = { "Java", 11, 'D' };

		// Length
		System.out.println("Length: " + objArr.length);

		// Read single value
		System.out.println("Single value: " + objArr[2]);

		// Read all values
		// * for
		for (int i = 0; i < objArr.length; i++) {
			System.out.print(objArr[i] + "| ");
		}

		System.out.println();

		// * for-each
		for (Object x : objArr) {
			System.out.print(x + "| ");
		}
	}

}
