package PracticeProgramsCoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Anagram {

	// ip: {“cat”, “dog”, “tac”, “god”, “act”}
			//op: [dog,god]
			//[cat,tac,act]
	
	public static void main(String[] args) {
		singleAnagram();
		listAnagram();
	}
	
	public static void singleAnagram() {
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
	}
//=========================================================================================
	public static void listAnagram() {
		List<String> lt=new ArrayList<String>();
		lt.add("cat");
		lt.add("Dog");
		lt.add("tac");
		lt.add("gOd");
		lt.add("Act");
		
		String istr;
		String jstr;
		Set<String> lt1=new LinkedHashSet<String>();
		ArrayList<String> lt2=new ArrayList<String>();
		
		for(int i=0; i<lt.size(); i++) {
			for(int j=i+1; j<lt.size(); j++) {
				istr=lt.get(i);
				jstr=lt.get(j);
				if(istr.length()==jstr.length()) {
					//System.out.println("Lengths are equal");
					char[] ch1=istr.toLowerCase().toCharArray();
					char[] ch2=jstr.toLowerCase().toCharArray();
					Arrays.sort(ch1);
					Arrays.sort(ch2);
			
					if(Arrays.equals(ch1, ch2)) {
						lt1.add(istr);
						lt1.add(jstr);
						System.out.println(istr+" and "+jstr+" are aanagram");
					}
					else {
						System.out.println(istr+" and  "+jstr+" are not anagram");
					}
				}
				
			}
			
		}
		System.out.println(lt1);
		
	}	
}
