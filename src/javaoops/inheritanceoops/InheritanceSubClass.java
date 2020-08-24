package javaoops.inheritanceoops;

public class InheritanceSubClass extends InheritanceSuper {

	private int pro;
	private String res;
	
	public void multiplication(int x, int y) {
	      int z = x * y;
	      System.out.println("The product of the given numbers:"+z);
}
	public void display() {
		System.out.println("Displaying sub class method");
	}
	public void subMethod(int a, int b) {
		InheritanceSuper subDemo = new InheritanceSubClass();
		InheritanceSubClass subSubDemo = new InheritanceSubClass();
		
		/*
		subDemoTwo.addition(a, b);
		subDemoTwo.Subtraction(a, b);
		subDemoTwo.display();
		subDemoTwo.multiplication(a, b);
		subDemoTwo.display();
		super.display();
		*/
		//super.display();
		//subSubDemo.display();
		//subDemo.multiplication(10, 20);
		super.display();
		subDemo.display();
		subSubDemo.display();
		//subDemo.multiplication(11, 12);
	}
	public void supMethod(int a , int b) {
		
		
	}
	
	public static void main(String[] args) {
		int a = 20, b = 10;
		
		InheritanceSubClass sub = new InheritanceSubClass();
		sub.subMethod(a,b);
		//sub.supMethod(a, b);
				
	}
}
