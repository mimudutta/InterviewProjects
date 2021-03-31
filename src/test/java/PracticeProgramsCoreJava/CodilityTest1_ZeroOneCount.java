package PracticeProgramsCoreJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CodilityTest1_ZeroOneCount {
	
	
	public static int zerosAndOnes(String s) {
		int cZero = 0;
		int cOne = 0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='0') {
				cZero++;
				System.out.println("Zero Count:+"+cZero);
			}
			else if(s.charAt(i)=='1') {
				cOne++;
				System.out.println("One Count:"+cOne);
			}	
			else {
				return s.length();
			}
		}
		
		if(cZero>cOne) {
			return cZero-cOne;
		}
		else if(cZero>cOne) {
			return cZero-cOne;
		}
		else {
			return 0;
		}	
	}
	
	
	public static void main(String[] args) {
		System.out.println(zerosAndOnes("11100*00")); // "111000"=0   "111*000"=7  "01010"=1
		
		
	}
	

}
