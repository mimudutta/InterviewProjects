package PracticeProgramsCoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexMultiplication {

	public static void main(String[] args) {
		
		/*
		 * Write a program to create a new list such that each element at index i of the
		 * new list is the product of all the numbers of a given list of integers except
		 * the one at i. 
		 * Input: [10, 20, 30, 40, 50] 
		 * Output: [1200000, 600000, 400000,
		 * 									300000, 240000]
		 */

		List<Integer> newlt=new ArrayList<>();
		Integer temp;
		List<Integer> lt=new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		
		int size=lt.size();
		int prod= 1;
		System.out.println("ArraySize:"+size);
		for(int i=0; i<size; i++) {
			prod=1;
			for(int j=0; j<size; j++) {
				if(i!=j) {
					prod=prod * lt.get(j);
				}
			
			}
			System.out.println(prod);
			newlt.add(prod);
			
		}
		System.out.println("new Array:"+newlt);
		
	}

}
