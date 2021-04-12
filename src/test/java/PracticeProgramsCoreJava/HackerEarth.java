package PracticeProgramsCoreJava;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class HackerEarth {

	public static void main(String[] args) {
		List<Integer> lt=Arrays.asList(10,20,10,10,30,20,50,60);
		//System.out.println(deleteProducts(lt, 2));
		
		System.out.println(moves(lt));

	}
	
	public static int deleteProducts(List<Integer> ids, int m) {
		Set<Integer> st=new TreeSet<>();
		System.out.println(ids.size());
		for(int i=0; i<ids.size(); i++) {
			for(int j=i+1; j<=m; j++) {
				
				if(ids.get(i)==ids.get(j)) {
					ids.remove(i);
					break;
					//i=0;
				}
			}
		}
		for(Integer i:ids) {
			
			System.out.println(i);
			st.add(i);
			
		}
		System.out.println(st);
		
		return st.size(); 

	    }
	
	
	    public static int moves(List<Integer> arr) {
	        int count=0;
	        int temp;
	        for(int i=0; i<arr.size(); i++){
	            for(int j=i+1; j<arr.size(); j++){
	                if(arr.get(i) % 2==0 && arr.get(j) % 2==0){
	                temp=arr.get(i);
	                arr.add(i,arr.get(j));
	                arr.add(j,temp);
	                count ++;
	                }
	            }
	        }
	        return count;
	    }

}
