package MultiThreading.Synchronization;

public class Dispaly {

	public synchronized void wish(String name) throws InterruptedException {
		for(int i =0 ;i<10 ;i++) {
			System.out.println("I am in display : " + name);
			Thread.sleep(2000);
		}
	}
}
