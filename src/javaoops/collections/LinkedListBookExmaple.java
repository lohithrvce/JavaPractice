package javaoops.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBookExmaple {

	public static void main(String[] args) {
		
		List<Book> bok = new LinkedList<Book>();
		
		Book bokObj = new Book(2, "lohith","kuvempu", "pearson", 100);
		Book bokObj1 = new Book(3, "sharan","mysorerani", "naghu", 100);
		Book bokObj2 = new Book(1, "chukki","kuvempu", "kulli", 100);
		
		
		bok.add(bokObj);
		bok.add(bokObj1);
		bok.add(bokObj2);
		
		  for(Book bk:bok) {
			 //
		  }
	}
}
