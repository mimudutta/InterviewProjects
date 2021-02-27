package PracticeProgramsCoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interviewquestion2 {

	public static void main(String[] args) {
	//	i/p--1,2,3,2,2,4,5,6,6,7,7,8,1,2,3,4,4,5,6
		//o/p--{1=2, 2=4, 3=2, 4=3, 5=2, 6=3, 7=2, 8=1}
		
		Map<Integer, Integer> hm=new HashMap<Integer, Integer>();
		Integer[] ip= {1,2,3,2,2,4,5,6,6,7,7,8,1,2,3,4,4,5,6};
		/*
		 * List<Object> al=Arrays.asList(ip); for(Object o:al) { System.out.println(o);
		 * }
		 */
				
		for(int i=0;i<ip.length;i++) {
			//System.out.println(ip[i]);
			if(hm.get(ip[i])!=null) {
				hm.put(ip[i],hm.get(ip[i])+1);
			}
			else {
				 hm.put(ip[i],1);
			}
			//System.out.println(hm);
		}
		System.out.println(hm);
		
	}
}
