package PracticeProgramsCoreJava;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class ArrangeLargestNoinArray {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array in positive integer:");
	      int length = s.nextInt();
	      int [] myArray = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<length; i++ ) {
	         myArray[i] = s.nextInt();
	      }
	      List<Integer> listOfNumbers = new ArrayList<>();
	      for( int j=0;j<myArray.length-1;j++) {
	    	  listOfNumbers.add(myArray[j]);
	      }
		
		 //= Arrays.asList(2,20,24,6,8);  
	    Collections.sort(listOfNumbers, new MyComparator());
	    System.out.println("Biggest number is-");
	    // Biggest number
	    for(Integer i : listOfNumbers){
	     System.out.print(i);
	    }

	}

}

class MyComparator implements Comparator<Integer>{
	  @Override
	  public int compare(Integer i, Integer j) {
	    // Appending before comparison
	    String str1 = i.toString() + j.toString();
	    String str2 = j.toString() + i.toString();
	    return str2.compareTo(str1);
	  }
	}

/*
 * testCases 
 * 1.enter positive integer value for length of the array.
 * 2.enter negative integer value for length of the array.
 * 3.enter string value for length of the array.
 * 4.enter special character value for length of the array.
 * 5.try entering special character value for array elements.
 * 6.try entering string value for array elements.
 * 7.try entering negative value for array elements.
 * 8.enter null value for array elements
 * 
 */