package MultiThreading;

public class MyThereadInter extends Thread {

	@Override
	public void run() {
	
		try {
			for (int i = 0; i < 10000; i++) {
				System.out.println("Running 10000 times");
			}
			Thread.sleep(20000);
			/*
			for (int i = 0; i < 10; i++) {
				System.out.println("I am lazy thread");
				Thread.sleep(2000);
			}
			*/
		} catch (InterruptedException e) {
			System.out.println("Thread got interuppted");
		}
	
	}
}
