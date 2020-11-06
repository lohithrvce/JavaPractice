package javaoops.collections.MapPractice;

import java.util.Comparator;

public class MyTreeMapComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
	
		return -o1.compareTo(o2);
	}
}
