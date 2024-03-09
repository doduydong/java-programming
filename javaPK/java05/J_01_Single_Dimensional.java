package java05;

public class J_01_Single_Dimensional {

	public static void main(String[] args) {
		// Array is used to store multiple values in a single variable, instead of declaring separate variables for each value.

		// Declare
		int[] numbers = new int[6];

		numbers[0] = 13;
		numbers[1] = 10;
		numbers[2] = 14;
		numbers[3] = 7;
		numbers[4] = 25;
		numbers[5] = 12;

		String[] tools = { "Java", "Selenium", "TestNG" };

		// Length
		System.out.println("Length of 'numbers': " + numbers.length);

		System.out.println("Length of 'tools': " + tools.length);

		// Read single value
		System.out.println("Single value of 'numbers': " + numbers[1]);

		System.out.println("Single value of 'tools': " + tools[0]);

		// Read all values
		// * for
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "| ");
		}

		System.out.println();

		for (int i = 0; i < tools.length; i++) {
			System.out.print(tools[i] + "| ");
		}

		System.out.println();

		// * for-each
		for (int number : numbers) {
			System.out.print(number + "| ");
		}

		System.out.println();

		for (String tool : tools) {
			System.out.print(tool + "| ");
		}
	}

}
