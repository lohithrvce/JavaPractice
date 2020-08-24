package codechallenge;

import java.util.Scanner;

public class BodmasExpression {

	public static void main(String[] args) {
		
		System.out.println("Bodmas Challenge");
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		char[] splitCharArray = input.toCharArray();
		
		for (int i=0;i < input.length();i++) {
			System.out.println(splitCharArray[i]);
			
			
		}
	}
}
