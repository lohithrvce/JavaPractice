package javaoops.collections;

import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(23);
		ts.add(12);
		ts.add(234);
		ts.add(2);
		ts.add(9);
		
		System.out.println(ts.headSet(234));
		System.out.println(ts.hashCode());
		
		
	}
}
