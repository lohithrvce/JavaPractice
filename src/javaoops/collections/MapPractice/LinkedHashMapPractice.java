package javaoops.collections.MapPractice;

import java.util.LinkedHashMap;

public class LinkedHashMapPractice {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lm = new LinkedHashMap<Integer, String>();
		
		lm.put(10, "lohi");
		lm.put(11, "foo");
		lm.put(12, "bar");
		lm.put(14, "love");
		
		System.out.println(lm);
	}
}
