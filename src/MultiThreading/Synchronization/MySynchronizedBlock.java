package MultiThreading.Synchronization;

public class MySynchronizedBlock {

	public static void main(String[] args) {
		DisplaySynchronizedBlock d = new DisplaySynchronizedBlock();
		
		MythreadSynch t1 = new MythreadSynch(d, "Lohith");
		MythreadSynch t2 = new MythreadSynch(d, "Sharan");
		
		t1.start();
		t2.start();
	}
}
