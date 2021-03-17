package PracticeProgramsCoreJava;

import java.util.HashMap;
import java.util.HashSet;

public class HackerEarthMinimumWindowSubstring {

	public static void main(String[] args) {
		
		System.out.println(solution("aabcddcbbaaadddbbcaaaaddbcbdccacddce"));

	}
	
	public static int solution(String str) {
		int len=str.length();
		
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			set.add(ch);
		}
		
		int i=-1;
		int j=-1;
		HashMap<Character, Integer> map=new HashMap<>();
		
		while(true) {
			boolean f1=false;
			boolean f2=false;
			
			//aquire till its invalid(map.size()<set.size())
			while((i<str.length()-1) &&(map.size()<set.size())){
				i++;
				char ch=str.charAt(i);
				map.put(ch, map.getOrDefault(ch,0)+1);
				f1=true;
			}
			
			
			//collect and release
			while(j<i && (map.size()==set.size())){
				int potLength=i-j;
				if(potLength<len) {
					len=potLength;
				}
				
				j++;
				char ch=str.charAt(j);
				if(map.get(ch)==1) {
					map.remove(ch);
				}
				else {
					map.put(ch, map.get(ch)-1);
				}
				f2=true;
			}
			
			
			if(f1==false && f2==false) {
				break;
			}
		}
		return len;
		
	}

}
