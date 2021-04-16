package OnlineTestPgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImportantSubstringSubSeq {

	//=====================Find substring from a String=====================
	public static List<String> subString(String str) {
		List<String> lt=new ArrayList<>();
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<=str.length(); j++) {
				String subStr=str.substring(i, j);
				lt.add(subStr);
				System.out.println(lt.get(i)+"  Length="+lt.get(i).length());
			}
		}
		Collections.reverseOrder();
		return lt;
	}
	
	//===================Find SubSquence from a String=====================
	public static void SubSquence(String str, String subSeq) {
		if (str.equals("")) {
			System.out.println("SubSequence:"+subSeq);
			return;
		}
		SubSquence(str.substring(1), subSeq+str.charAt(0));
		SubSquence(str.substring(1), subSeq);
	}
	
	public static void SubSquence(String str ) {
		SubSquence(str, "");
	}
	
	//===================check one string is SubSquence of other string=====================
	public static boolean checkSubSequence(String searchStr,String mainStr)	{
		
		if(searchStr.length()==0) {
			return true;
		}
	
		int i=0;
		int j=0;
		
		while(i<searchStr.length() && j<mainStr.length()) {
			if(searchStr.charAt(i)==mainStr.charAt(j)) {
				i++;
			}
			if(searchStr.length()==i) {
				return true;
			}
			j++;
		}
		
		return false;
		
	}
	
	public static void printCheckSubString(String searchStr,String mainStr){
		if (checkSubSequence(searchStr,mainStr)==true) {
			System.out.println("Given string is subsequence of the other");
		}
		else {
			System.out.println("Given string is not subsequence of the other");
		}
	}
	
	//===================check one string is SubString of other string=====================
	public static int checkSubString(String searchStr,String mainStr)	{
		 int M = searchStr.length();
	     int N = mainStr.length();
	 
	        for (int i = 0; i <= N - M; i++) {
	        	int j;
	            for (j = 0; j < M; j++) {
	                if (mainStr.charAt(i + j) != searchStr.charAt(j)) {
	                    break;
	                }
	            }
	 
	            if (j == M)
	                return i;
	        }
	 
		return -1;
		
	}
	
	public static void printSubStringIndex(String searchStr,String mainStr){
		if (checkSubString(searchStr,mainStr)==-1) {
			System.out.println("Given string doesnot exist in main String");
		}
		else {
			System.out.println("Given string is present in index "+checkSubString(searchStr,mainStr)+" main String");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("SubString:"+subString("ABC"));
		System.out.println("==========================================");
		SubSquence("ABC");
		System.out.println("==========================================");
		printCheckSubString("cgh","abcdefgh"); //ip: "abf","abcdefgh" ; "cabf","abcdefgh" ; "cgh","abcdefgh"
		printSubStringIndex("efg","abcdefgh");
	}

}
