package MultiThreading.Synchronization;

public class MythreadSynch extends Thread{
	DisplaySynchronizedBlock d;
	String name;
	
	public MythreadSynch(DisplaySynchronizedBlock d , String name) {
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
}
