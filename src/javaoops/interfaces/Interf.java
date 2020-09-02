package javaoops.interfaces;

public interface Interf {

	int a = 10;
	void m1();
	void m2();
	default void m3() {
		System.out.println("hello");
	}
	
	static void m5() {
		System.out.println("test");
	};
	
	void m21();
	//

	}
