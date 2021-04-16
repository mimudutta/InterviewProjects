package PracticeProgramsCoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Compare2List {

	public static void main(String[] args) {
		List<Integer> volcanic =new ArrayList<>(Arrays.asList(7000,7000,12000,13000,6900));
		List<Integer> nonVolcanic =new ArrayList<>(Arrays.asList(6910,7010,7000,7000,7000,12000,18000,15000,10450));
		
		System.out.println(sortIntersect(volcanic,nonVolcanic));
		//sortIntersect(volcanic,nonVolcanic);
		
	}
	
	public static List<Integer> sortIntersect(List<Integer> volcanic, List<Integer> nonVolcanic) {
	    List<Integer> it =new ArrayList<>();
	    
	    for (int i = 0; i < volcanic.size(); i++) {
	        for (int j = 0; j < nonVolcanic.size(); j++) {
	            if(volcanic.get(i).equals(nonVolcanic.get(j))){
	                it.add(volcanic.get(i));
	                volcanic.remove(i);
	                nonVolcanic.remove(j);
	                j--;
	                i--;
	                break;
	            }
	    }
	    }
	    Collections.sort(it);
	    Collections.reverse(it);
	    //System.out.println(it);
	    return it;
	    }

}
