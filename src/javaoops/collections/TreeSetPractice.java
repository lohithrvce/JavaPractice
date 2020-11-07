package javaoops.collections;

import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>(new MyComparator());
		ts.add(23);
		ts.add(12);
		ts.add(234);
		ts.add(2);
		ts.add(9);
		System.out.println(ts.lower(13));
		
		//System.out.println(ts.headSet(234));
		System.out.println(ts.hashCode());
		
		System.out.println("A".compareTo("A"));
		System.out.println(ts);
	
		TreeSet<String> tstring = new TreeSet<String>(new MyStringComparator());
		
		tstring.add("lohith");
		tstring.add("sharan");
		tstring.add("deepu");
		tstring.add("thummu");
		System.out.println(tstring);
	}
}
