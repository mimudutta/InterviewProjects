package PracticeProgramsCoreJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintUniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="acbacdbefgh"; //aabc //abhimanyu //acbacdb //OP:b
		
		StringBuffer sb=new StringBuffer(str);
		//System.out.println(sb.length());
		
		for(int i=0; i<sb.length(); i++) {
			for(int j=i+1; j<sb.length(); j++) {
				if(sb.charAt(i)==sb.charAt(j)) {
					sb.deleteCharAt(j);
					//j--;
					sb.deleteCharAt(i);
					//i--;
					//break;
				}
			}
		}
		String strnew=sb.toString();
		System.out.println("using StringBuffer:"+strnew);   //not fully correct approach
	
		System.out.println("Using LinkedHashMap:"+uniqueEle(str));  //fully correct approach
		
		System.out.println("Using classical approach:"+firstUniqChar(str));  //fully correct approach
		
 }
	
	public static String uniqueEle(String s) {
		
		Map<String, Integer> lhm=new LinkedHashMap<>();
		String[] arr=s.split("");
		String temp="";
			for(String str:arr) {
				if (lhm.get(str)!=null) {
					lhm.put(str, lhm.get(str)+1);
				}
				else {
					lhm.put(str, 1);
				}
			}
			System.out.println(lhm);
			
			Set<Map.Entry<String, Integer>> entrySet=lhm.entrySet();
			Iterator<Map.Entry<String, Integer>> it=entrySet.iterator();
			while(it.hasNext()) {
				Map.Entry<String, Integer> elements=it.next();
				//System.out.println("keys:"+elements.getKey()+" value:"+elements.getValue());
				if (elements.getValue()<2) {
					//System.out.println("Keys<2:"+elements.getKey());
					temp=elements.getKey();
					break;
				}
			}
		return temp;
	}
	
	public static int firstUniqChar(String s) {
        char[] a = s.toCharArray();
  
        for(int i=0; i<a.length;i++){
        	if(s.indexOf(a[i])==s.lastIndexOf(a[i])){  //aabaaabbc
        		System.out.println(a[i]);
        		//System.out.println(s.charAt(i));
        		return i;
        		}
	    }
        return -1;
	}

}


