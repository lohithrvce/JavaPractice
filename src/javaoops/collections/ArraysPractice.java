package javaoops.collections;

import java.util.Arrays;

public class ArraysPractice {

	
	public static void main(String[] args) {
		
		int intArr[] = {10,23,35,1,42,5,123,5,25,6,78,14,87,12};
		
		Arrays.sort(intArr);
		
		/*
		for(int i:intArr) {
			System.out.println(intArr[i]);
		}
		*/
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		int index= Arrays.binarySearch(intArr,29);
		System.out.println(index);
		
	}
}
