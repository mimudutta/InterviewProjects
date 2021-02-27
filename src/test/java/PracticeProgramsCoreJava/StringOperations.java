package PracticeProgramsCoreJava;

import java.util.Scanner;

import org.testng.annotations.Test;

public class StringOperations {
	
	@Test(enabled=false)
	//Reverse a given string and Pallindrom
	public void stringReverse() {
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		String strRev="";
		
		
		for(int i=str.length()-1;i>=0;i--) {
			strRev=strRev+str.charAt(i);
		}
		System.out.println("ReversedString:"+strRev);
		
		if(str.equalsIgnoreCase(strRev)) {
			System.out.println("String is pallindrome");
		}
		else {
			System.out.println("String is not pallindrome");
		}
		
	}
	
	@Test
	//program to avoid repetation is avoided in a string
	public void avoidDuplicateChar() {
		Scanner scn=new Scanner(System.in); //developer
		String str=scn.next();
		String newstr="";
		
		for(int i=0;i<str.length();i++) {
			if(newstr.indexOf(str.charAt(i))==-1) {
				newstr=newstr+str.charAt(i);
			}
		}
		System.out.println(newstr);
	}
	

}
