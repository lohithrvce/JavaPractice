package javaoops.interfaces;

public class InterImplementClass implements Interf{

	@Override
	public void m1() {
		System.out.println("m1");
		
	}

	@Override
	public void m2() {
		System.out.println("m2");
		
	}

	@Override
	public void m21() {
		System.out.println("m21");
		
	}

	public static void main(String[] args) {
		InterImplementClass ob = new InterImplementClass();
		ob.m1();
		ob.m2();
		ob.m21();
		ob.m3();
		Interf.m5();
	}
}
