package javaoops.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {

	
	
	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> all = new ArrayList<Integer>(al);
		ArrayList<Integer> alll = new ArrayList<Integer>(100);
		
		
		System.out.println(al instanceof Serializable);
		
		
		// synchronized version of arraylist
		
		 List<Integer> allsync = Collections.synchronizedList(al);
		 al.add(10);
		 al.add(11);
		 al.add(9);
		 al.add(5);
		 al.add(15);
		 al.add(13);
		 
		//Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al, new MyListComparator());
		System.out.println(al);
	}
}

