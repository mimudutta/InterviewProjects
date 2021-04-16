package OnlineTestPgm;

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
		else if(cZero<cOne) {
			return cOne-cZero;
		}
		else {
			return 0;
		}	
	}
	
	
	public static void main(String[] args) {
		//System.out.println(zerosAndOnesNew("111*000")); // "111000"=0   "111*000"=7  "01010"=1 "110*111000011100000"=5
		System.out.println(zerosAndOnes("01010"));
			
	}
	
	public static int zerosAndOnesNew(String s) {
		int cZero = 0;
		int cOne = 0;
		int chcount = 0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='0') {
				cZero++;
				System.out.println("Zero Count:"+cZero);
			}
			else if(s.charAt(i)=='1') {
				cOne++;
				System.out.println("One Count:"+cOne);
			}	
			else if (s.charAt(i)=='*') {
				chcount++;
				System.out.println("Ch Count:"+chcount);
			}
			//else {
			//	return s.length();
			//}
		}
		
		
		if(cZero>cOne || Character.isLetterOrDigit('*') ) {
			return cZero-cOne+chcount;
		}
		
		else if(cZero<cOne || Character.isLetterOrDigit('*') ) {
			return cOne-cZero+chcount;
		}
		
		else if(cZero==cOne || Character.isLetterOrDigit('*') ) {
			return 0+chcount;
		}
		
		else {
			return s.length();
		}	
	}
	

}
