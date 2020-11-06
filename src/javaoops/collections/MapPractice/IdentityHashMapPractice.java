package javaoops.collections.MapPractice;

import java.util.IdentityHashMap;

public class IdentityHashMapPractice {
	
	
	public static void main(String[] args) {
	
		IdentityHashMap<Integer, String> ihm = new IdentityHashMap<Integer, String>();
		
		ihm.put(10, "lohith");
		ihm.put(10, "sharan");
		System.out.println(ihm);
	}
}
