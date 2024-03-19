package java09;

public class J_00_Testing {

	public static void main(String[] args) {
		// Polymorphism
		J_01_Polymorphism poly = new J_01_Polymorphism();

		poly.sum(13, 10);

		poly.sum(17.4f, 9.5f);

		poly.sum(3, 19.3f);

		poly.sum(19.3f, 3);

		// Encapsulation
		J_02_Encapsulation encap = new J_02_Encapsulation();

		encap.setID("AFC01");
		System.out.println(encap.getID());

		encap.setName("Dong");
		System.out.println(encap.getName());

		encap.setAmount(999999999.9);
		System.out.println(encap.getAmount());
	}

}
