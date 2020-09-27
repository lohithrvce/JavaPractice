package javaoops.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
	
		Vector<Integer> vc = new Vector<Integer>();
		vc.add(2);
		vc.add(4);
		vc.add(5);
		vc.add(12);
		vc.add(16);
		
		vc.remove(2);
		vc.add(2, 9);
		vc.addElement(8);
		
		vc.firstElement();
		
		// Java Curoor Iterator
		Iterator< Integer> it = vc.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			//it.remove();
			
		} 
		//Java cursor ListIterator
		ListIterator<Integer> lit = vc.listIterator();
		
		while(lit.hasNext()) {
			System.out.println(lit.next());
			//lit.set(e);
		}
		System.out.println(vc.capacity());
		// Java Cursor Enumeration Object
		Enumeration<Integer> e = vc.elements();
		
		
		while (e.hasMoreElements()){	
			System.out.println(e.nextElement());
		}
		
		System.out.println(e.getClass().getName());
	}
}
