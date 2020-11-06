package javaoops.overloading;

public class MethodOverloading {

	public void m1(int i) {
		System.out.println("inisde m1");
	}
	
	public void m1(float j) {
		System.out.println("inisde long");
	}
	
	public static void main(String[] args) {
		MethodOverloading ob = new MethodOverloading();
		ob.m1(10);
		// Automatic Promotion in overloading 
		ob.m1('c');
		ob.m1(10l); 
		
	}
}
