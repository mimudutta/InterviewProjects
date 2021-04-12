package PracticeProgramsCoreJava;

import java.util.Scanner;

public class VeryImportantQuestion1 {

	public static void main(String[] args) {
		
		
		String str1="QA Test Automation";  //op:no itam otuAtseTAQ
		String revString="";
		String finalString="";
		
		for(int i=str1.length()-1;i>=0;i--) {   //Step1:reverse the value string
			revString=revString+str1.charAt(i);
		}
		System.out.println(revString);   
		String tempString=revString.replace(" ", "");  //Step2:replace the spaces or special ch. in rev string
		System.out.println(tempString);  
		int idx1=str1.indexOf(" ");
		int idx2=str1.indexOf(" ",str1.indexOf(" ")+1);
		System.out.println("indexes are: "+idx1+","+idx2);//Step3:get the indexes of the spaces or special ch.
		
		for(int i=0;i<tempString.length();i++) {          //Step4:in another empty string add spaces or special ch. 
			if(i==idx1||i==idx2-1) {
				finalString=finalString+" ";
			}
			finalString=finalString+tempString.charAt(i);
		}
		System.out.println("Final O/p: "+finalString);
		System.out.println("============================================================");

		// I/P : @abxy@rt
		// O/P : @tryx@ba

		String str2 = "@abxy@rt"; 
		String revstr2 = "";
		String opStr="";

		
		  for(int i=str2.length()-1;i>=0;i--) { 	  
			  revstr2=revstr2+str2.charAt(i);
		  }
		System.out.println(revstr2); //tr@yxba@
		String tempStr=revstr2.replace("@", "");
		
		int indx1=str2.indexOf("@");
		int indx2=str2.indexOf("@", str2.indexOf("@")+1);
		System.out.println("indexes are: "+indx1+","+indx2);
		
		for(int i=0;i<tempStr.length();i++) {
			
			if(i==indx1||i==indx2-1) {
				opStr=opStr+"@";
			}
			opStr=opStr+tempStr.charAt(i);
		}
		System.out.println("O/P:"+opStr);
		
		
		System.out.println("============RevWordsinSentence:=============================");
		RevWordsinSentence();
	}
	
public static void RevWordsinSentence() {
	
	// This is a discussion
	// siht si a noissucsid
		
		String str="This is a discussion";
		String[] arr=str.split(" ");
		String temp1="";
		String finalStr="";
		
		//rev(arr);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=arr[i].length()-1; j>=0; j--) {
				temp1=temp1+arr[i].charAt(j);
				//System.out.println(temp1);	
			}
		}
		
		int idx1=str.indexOf(" ");
		int idx2=str.indexOf(" ",idx1+1);
		int idx3=str.indexOf(" ",idx2+1);
		System.out.println(idx1+" "+idx2+" "+idx3);
		
		
		
		for(int i=0; i<temp1.length(); i++) {
			if(i==idx1-1||i==idx2-2||i==idx3-3) {
				finalStr=finalStr+temp1.charAt(i)+' ';
			}
			else {
				finalStr=finalStr+temp1.charAt(i);
			}
		}
		System.out.println(temp1);
		System.out.println(finalStr);
	
	
	}

}
