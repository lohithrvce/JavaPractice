package MultiThreading;

public class MyThread extends Thread{

	static Thread mt;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			//Thread.yield();
			try {
				mt.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
	}
	public void run(int j) {
		// TODO Auto-generated method stub
	
		for (int i = 0; j < 10; i++) {
			System.out.println("Child overload run Thread");
		}
	}
	
}
