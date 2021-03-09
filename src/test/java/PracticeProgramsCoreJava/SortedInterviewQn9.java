package PracticeProgramsCoreJava;

import java.util.Arrays;
import java.util.Scanner;

public class SortedInterviewQn9 {

	public static void main(String[] args) {
		// 321564
		// 123456  n=2
		// 654321
		
		System.out.println(input());
		
	}
	
	public static int input() {
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array in positive integer:");
	      int length = s.nextInt();
	      int [] myArray = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<length; i++ ) {
	         myArray[i] = s.nextInt();
	      }
	      System.out.println("Enter Nth largest element in positive integer less then length of array:");
			int N = s.nextInt();

		Arrays.sort(myArray);
		return myArray[myArray.length-N];
		
	}

}

/* TestCases 
 * 1.enter positive integer value for length of the array.
 * 2.enter positive integer value for Nth largest element.
 * 3.enter negative integer value for length of the array.
 * 4.enter negative integer value for Nth largest element.
 * 5.enter string value for length of the array.
 * 6.enter special character value for length of the array.
 * 7.enter string value for Nth largest element.
 * 8.enter special character value Nth largest element.
 * 9.try entering special character value for array elements.
 * 10.try entering special character value for array elements.
 * 11.try entering string value for array elements.
 * 
 * */




