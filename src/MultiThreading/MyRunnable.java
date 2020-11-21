package MultiThreading;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	for (int i = 0; i < 10; i++) {
		System.out.println("Calling Runnable thread Class");
		
	}	
	System.out.println("This line is executed by Thread : " + Thread.currentThread().getName());
	}
}
