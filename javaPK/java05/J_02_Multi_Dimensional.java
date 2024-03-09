package java05;

public class J_02_Multi_Dimensional {

	public static void main(String[] args) {
		// Multidimensional arrays is used to store data as a tabular form, like a table with rows and columns.
		// [row][column]

		// Declare
		int[][] numbers = new int[3][2];

		numbers[0][0] = 13;
		numbers[0][1] = 10;
		numbers[1][0] = 14;
		numbers[1][1] = 7;
		numbers[2][0] = 25;
		numbers[2][1] = 12;

		String[][] tools = { { "Java", "11" }, { "Selenium", "3.141.59" }, { "TestNG", "6.14.3" } };

		// Length
		System.out.println("Length of rows:" + numbers.length);
		System.out.println("Length of column (By row index): " + numbers[1].length);

		System.out.println("Length of rows:" + tools.length);
		System.out.println("Length of column (By row index): " + tools[0].length);

		// Read single value
		System.out.println("Single value of 'numbers': " + numbers[0][1]);

		System.out.println("Single value of 'tools': " + tools[0][0]);

		// Read all values
		// * for
		for (int r = 0; r < numbers.length; r++) {
			for (int c = 0; c < numbers[r].length; c++) {
				System.out.print(numbers[r][c] + " ");
			}
			System.out.println();
		}

		for (int r = 0; r < tools.length; r++) {
			for (int c = 0; c < tools[r].length; c++) {
				System.out.print(tools[r][c] + " ");
			}
			System.out.println();
		}

		// * for-each
		for (int[] number : numbers) {
			for (int n : number) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		for (String[] tool : tools) {
			for (String t : tool) {
				System.out.print(t + " ");
			}
			System.out.println();
		}
	}

}
