package javaoops.methodoverriding;

public class Child extends Parent {

	public void property() throws Exception, NullPointerException {
		
		Parent p3 = new Parent();
		//p3.property(1);
		Parent.display();
		System.out.println("Child Property is Running");
	}

	/*
	 * public static void display() {
	 * System.out.println("running child static display"); }
	 */
	
	
	public static void main(String[] args) throws Throwable {
		
		Parent p = new Parent();
		//p.property(10);

		Child c = new Child();
		c.property();

		Parent p1 = new Child();
		//p1.property();

		// Parent.display();
		//Parent.display();

	}
}
