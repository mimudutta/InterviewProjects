package PracticeProgramsCoreJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.collections.map.HashedMap;

public class MapManipulation {
	

	public static void main(String[] args) {
		
		int i=0;
		
		ArrayList<Object> lt= new ArrayList<>();
		lt.add("Mimu");
		lt.add("Sham");
		lt.add("Ram");
		lt.add("Pam");
		lt.add("qam");
		
		
		Map<Object, Object> hm=new TreeMap();
		
		Iterator<Object> it= lt.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			//hm.put(it.next(), 1);
			hm.put(i+1,it.next());
			i++;
			
		}
		
		System.out.println(hm);
		/*
		 * Iterator<Object> it1= hm.keySet().iterator(); while(it.hasNext()) {
		 * 
		 * }
		 */

	}

}
