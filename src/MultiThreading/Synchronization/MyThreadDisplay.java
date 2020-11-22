package MultiThreading.Synchronization;

public class MyThreadDisplay extends Thread {

	Dispaly d;
	String name;
	
	public MyThreadDisplay(Dispaly d, String name) {
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	try {
		d.wish(name);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
