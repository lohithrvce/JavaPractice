package javaoops.collections;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		Stack< String> st = new Stack<String>();
		
		st.push("lohith");
		st.push("sharan");
		st.pop();
		st.push("chukki");
		st.push("chandrama");
		st.push("kulli");
		
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.search("chukki"));
		System.out.println(st.capacity());
	}
}
