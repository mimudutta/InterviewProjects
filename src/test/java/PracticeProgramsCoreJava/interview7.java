package PracticeProgramsCoreJava;

import java.util.ArrayList;
import java.util.List;

public class interview7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ip: {“cat”, “dog”, “tac”, “god”, “act”}
		//op: [dog,god]
		//[cat,tac,act]
		String string="kjhgtfs";
		string.

		List<String> lt=new ArrayList<String>();
		lt.add("cat");
		lt.add("dog");
		lt.add("tac");
		lt.add("god");
		lt.add("act");
		List<String> lt1=new ArrayList<String>();
		
		for(int i=0;i<lt.size();i++) {
			for(int j=0;j<(lt.get(i)).length()-1;j++) {
				for(int k=0;k<(lt.get(i+1)).length()-1;k++) {
					/*
					 * if((lt.get(i)).charAt(j)==(lt.get(i)).charAt(k)) { lt1.add(lt.get(i)); }
					 */
					if((lt.get(i)).indexOf(lt.get(i+1))) {}
				}
				
			}
			
		}
		for(String s:lt1) {
			System.out.println(s);
		}
				
	}

}
