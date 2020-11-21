package MultiThreading;


public class MainThread {
	public static void main(String[] args) throws InterruptedException {
	
		
		MyThread myt = new MyThread();
		MyThread.mt = Thread.currentThread();
		myt.start();
		myt.join();
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
		/*
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setName("lohith");
		System.out.println(Thread.currentThread().getName());
		
		MyRunnable my = new MyRunnable(); 
		Thread t = new Thread(my);
		t.join();
		t.start();
		t.setName("Sharan");
		System.out.println(t.getName());
		//t.setPriority(10);
		System.out.println(t.getPriority());
		System.out.println("This line is executed by Thread : " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		*/
	}
}
