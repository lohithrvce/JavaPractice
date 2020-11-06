package javaoops.collections.MapPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(10, "l");
		hm.put(11, "s");
		hm.put(12, "u");
		
		System.out.println(hm);
		
		System.out.println(hm.values());
		Set<Entry<Integer, String>> entryset = hm.entrySet();
		 
		 Iterator<Entry<Integer, String>> itr = entryset.iterator();
		
		 while(itr.hasNext()) {
			 Entry<Integer, String> em = (Map.Entry<Integer,String>)itr.next();
			 
			 System.out.println(em.getKey() + em.getValue());
		 }
		 
		  Map<Integer, String> shm = Collections.synchronizedMap(hm);
		  
	}
}
