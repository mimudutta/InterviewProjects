package PracticeProgramsCoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayDuplicates {

	
	public static void main(String[] args) {
		
		LinkedList<Integer> al= new LinkedList<>(Arrays.asList(10,20,10,20,30,40,30));
		List<Integer> alNew= new ArrayList<>();
		//List<Integer> alNew1= new ArrayList<>();
		
		
		  for(int i=0; i<al.size(); i++) {
			  for(int k=i+1; k<al.size(); k++) {
				  if(al.get(i)==al.get(k)) { 
					  alNew.add(al.get(i)); 
					  }
				  }
			  }
		  
		  for(Integer i:alNew) {   // storing duplicates in new arraylist
		  System.out.println(i); }
		 
		System.out.println("=========================");
		
		for(int i=0; i<al.size(); i++) {
			for(int k=i+1; k<al.size(); k++) {
			if(al.get(i)==al.get(k)) {
				al.remove(k);
			}
		}
		}
		
		for(Integer i:al) {     // removing duplicates from arraylist
			System.out.println(i);
		}

	}

}
