package javaoops.collections.MapPractice;

import java.util.TreeMap;

public class TreeMapPractice {

	
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(new MyTreeMapComparator());
	
		tm.put(10, "lohith");
		tm.put(90, "lohith");
		tm.put(8, "lohith");
		tm.put(15, "lohith");
		System.out.println(tm);
	
	}
}
