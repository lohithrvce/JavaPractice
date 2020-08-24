package javaoops.inheritanceoops;

public class InheritanceSuper {

	private int z;

	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the given numbers:" + z);
	}

	public void Subtraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given numbers:" + z);
	}

	public void display() {
		System.out.println("Displaying Super class method");
	}

	/*
	 * public void multiplication(int x, int y) { int z = x * y;
	 * System.out.println("The product of the given numbers from Super class:" + z);
	 * }
	 */

}
