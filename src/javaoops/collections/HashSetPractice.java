package javaoops.collections;

import java.util.HashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("lohith");
		hs.add("sharan");
		hs.add("manju");
		hs.add(null);
		
		System.out.println(hs);
		
		HashSet<String> hss = new HashSet<String>(100);
		HashSet<String> hsss = new HashSet<String>();
	}
}