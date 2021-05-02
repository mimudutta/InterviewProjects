package PracticeProgramsCoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayDuplicates {

	
	public static void main(String[] args) {
		
		LinkedList<Integer> al= new LinkedList<>(Arrays.asList(10,60,20,10,20,30,40,30,60,50));
		List<Integer> alNew= new ArrayList<>();
		//List<Integer> alNew1= new ArrayList<>();
		
		
		  for(int i=0; i<al.size(); i++) {
			  for(int k=i+1; k<al.size(); k++) {
				  if(al.get(i)==al.get(k)) { 
					  alNew.add(al.get(i));       // storing duplicates in new arraylist
					  }
				  }
			  }
		  
		  for(Integer i:alNew) {   
		  System.out.println(i); }
		 
		System.out.println("=========================");
		
		for(int i=0; i<al.size(); i++) {
			for(int k=i+1; k<al.size(); k++) {
				if(al.get(i)==al.get(k)) {
					al.remove(k);
				}
			}
		}
		Collections.sort(al);
		for(Integer i:al) {     // removing duplicates from arraylist
			System.out.println(i);
		}
		
		System.out.println("==================================================");
		List<String> url= new ArrayList<>(Arrays.asList("http://wikipedia.com","http://apple.com","http://wikipedia.com","http://wikipedia.com","http://google.com"));
		for(int i=0; i<url.size(); i++) {
			for(int k=i+1; k<url.size(); k++) {
				if(url.get(i)==url.get(k)) {
					url.remove(k); 			// removing duplicates from arraylist
					k--;
				}
			}
		}
		
		//Collections.sort(url);
		for(String s:url) {     
			System.out.println(s);
		}
		
		Set<String> st=new TreeSet<>(url);  // for sorting in alphabetic order
		Iterator<String> it=st.iterator();
		while(it.hasNext()) {
			System.out.println("Set values: "+it.next());	
		}
		
	}

}
