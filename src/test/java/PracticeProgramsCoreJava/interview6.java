package PracticeProgramsCoreJava;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;




public class interview6 {

	public static void main(String[] args) {
		//ip: "nagravisiona"
		//op: a3
		
		String str="nagravisiona";
		String[] s=str.split("");
		
		/*
		 * for(String s1:s) { System.out.println(s1); }
		 */
		
		SortedMap<String,Integer> hm=new TreeMap<>();
		
		for(String temp:s) {
			if(hm.get(temp)!=null) {
				hm.put(temp, hm.get(temp)+1);
			}
			else {
				hm.put(temp, 1);
			}
		}
		System.out.println(hm);
		
		Iterator<String> iterator=hm.keySet().iterator();
		while(iterator.hasNext()) {
			String tempstr=iterator.next();
			if(hm.get(tempstr)>2) {
				System.out.println("o/p:"+tempstr+hm.get(tempstr));
			}
		}

	}
}
