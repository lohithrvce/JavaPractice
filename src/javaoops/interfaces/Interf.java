package javaoops.interfaces;

public interface Interf {

	int a = 10;
	void m1();
	void m2();
	default void m3() {
		System.out.println("m3");
	}
	
	static void m5() {
		System.out.println("m5");
	};

	
	void m21();

}