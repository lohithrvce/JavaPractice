package javaoops.collections;

import java.util.PriorityQueue;

public class QueuePractice {

	public static void main(String[] args) {
		
		PriorityQueue<String> pr = new PriorityQueue<String>();
		pr.offer("lohith");
		pr.offer("thimmu");
		pr.offer("deepu");
		pr.offer("ganav");
		pr.offer("chota");
		pr.offer("rahul");
		
		System.out.println(pr.peek());
		pr.poll();
		System.out.println(pr);
		
		PriorityQueue<String> cpr = new PriorityQueue<String>(new Integer(15), new MyQueueComparator());
		cpr.offer("lohith");
		cpr.offer("thimmu");
		cpr.offer("deepu");
		cpr.offer("ganav");
		cpr.offer("chota");
		cpr.offer("rahul");
		System.out.println(cpr);
	
		
	}
}
