package MultiThreading.Synchronization;

public class SynchroDemo {

	public static void main(String[] args) {
		Dispaly d = new Dispaly();
		MyThreadDisplay t1 = new MyThreadDisplay(d, "lohith");
		MyThreadDisplay t2 = new MyThreadDisplay(d, "Sharan");
		
		t1.start();
		t2.start();
	}
}
