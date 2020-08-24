package javaoops.inheritanceoops;

public class Child implements Three{

	@Override
	public void print_lohith() {
		System.out.println("lohith");
		
	}

	@Override
	public void print_for() {
		System.out.println("for");
		
	}

	@Override
	public void print_geek() {
		System.out.println("geek");
		
	}

	@Override
	public void show() {
		
		
	}
	public static void main(String[] args) {
		Child c= new Child();
	}
}
