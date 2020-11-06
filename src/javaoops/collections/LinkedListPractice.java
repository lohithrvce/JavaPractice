package javaoops.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
	
	
	public static void main(String[] args) {
	
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.addFirst(9);
		ll.remove();
		ll.addFirst(9);
		ll.addFirst(10);
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		ll.push(17);
		
		Iterator<Integer> llit = ll.descendingIterator();
		while(llit.hasNext()) {
			System.out.println(llit.next());
		}
		System.out.println(ll);
	}
	
	
	

}
