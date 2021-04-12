package PracticeProgramsCoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ip: {“cat”, “dog”, “tac”, “god”, “act”}
		//op: [dog,god]
		//[cat,tac,act]
		String str1="Keep";
		String str2="Peek";
		
		if(str1.length()==str2.length()) {
			char[] c1=str1.toLowerCase().toCharArray();
			char[] c2=str2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)) {
				System.out.println(str1+" and "+str2+" are anagram");
			}
			else {
				System.out.println(str1+" and  "+str2+" are not anagram");
			}
			
		}
		else {
			System.out.println(str1+" and "+str2+" are not anagram");
		}
//=========================================================================================
		List<String> lt=new ArrayList<String>();
		lt.add("cat");
		lt.add("dog");
		lt.add("tac");
		lt.add("god");
		lt.add("act");
		List<String> lt1=new ArrayList<String>();
		
		
		for(String s:lt1) {
			System.out.println(s);
		}
				
	}

}
