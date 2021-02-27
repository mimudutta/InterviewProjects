package PracticeProgramsCoreJava;

import java.util.Scanner;

public class InterviewQuestion4 {

	public static void main(String[] args) {

		// I/P : @abxy@rt
		// O/P : @tryx@ba

		//Scanner scn = new Scanner(System.in);
		// System.out.println("Enter the string:");
		String str = "@abxy@rt"; // scn.next();
		String opString = "";

		
		  for(int i=str.length()-1;i>=0;i--) { 	  
			  opString=opString+str.charAt(i);
		  }
		System.out.println(opString); //tr@yxba@
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==('@')) {
				System.out.println(str.indexOf(str.charAt(i)));
			}
		}
		
		

	}

}
