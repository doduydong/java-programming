package java10;

public class J_01_This {
	int x, y;

	public J_01_This(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void sum() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		J_01_This thisKey = new J_01_This(13, 10);

		thisKey.sum();
	}

}
