package javaoops.abstractionoops;

public class AbstractChild extends AbstrationSuper{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Inside the Child Abstraction");
		
	}
	
	public static void main(String[] args) {
		AbstractChild abChild = new AbstractChild();
		abChild.m1();
	}
}
