package MultiThreading;

public class MyMainThread {

	public static void main(String[] args) {
		MyThereadInter myt = new MyThereadInter();
		
		myt.start();
		myt.interrupt();
		System.out.println("Main thread ended");
	}
}
