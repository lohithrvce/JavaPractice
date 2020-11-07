package javaoops.collections.MapPractice;

import java.util.Hashtable;

public class HashTablePractice {

	public static void main(String[] args) {
		Hashtable<HashTemp, String> ht = new Hashtable<HashTemp, String>();
		
		ht.put(new HashTemp(10), "loith");
		ht.put(new HashTemp(14), "shar");
		ht.put(new HashTemp(4), "deepu");
		ht.put(new HashTemp(23), "rahul");
		ht.put(new HashTemp(14), "dhanuhs");
		ht.put(new HashTemp(45), "ganav");
		ht.put(new HashTemp(167), "thimmu");
		
		System.out.println(ht);
		
	}
}
