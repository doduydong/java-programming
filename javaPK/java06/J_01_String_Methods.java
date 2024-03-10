package java06;

public class J_01_String_Methods {

	public static void main(String[] args) {
		String course = "java programming";
		String tool = "JAVA PROGRAMMING";
		String version = "\nversion 11";
		String price = "$100";

		System.out.println(course.length());

		System.out.println(course.concat(version)); // System.out.println(course + version);

		System.out.println(course + " " + version.trim());

		System.out.println(course.charAt(13));

		System.out.println(course.contains("pro"));

		System.out.println(course.equals("java programming"));
		System.out.println(course.equals(tool));
		System.out.println(course.toUpperCase().equals(tool));
		System.out.println(course.equals(tool.toLowerCase()));
		System.out.println(course.equalsIgnoreCase(tool));

		System.out.println(version.replaceAll("11", "21"));

		System.out.println(course.substring(5, 8));

		String emailAddress = "dong.sdet@gmail.com";
		String[] emailArr = emailAddress.split("@");
		System.out.println(emailArr[0]);

		System.out.println(price.replace("$", ""));
	}

}
