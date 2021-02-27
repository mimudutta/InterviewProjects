package PracticeProgramsCoreJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Qn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ip--{10,20,20,30,30,30,40,50,50, 60, 70, 70,70};
		//op--10,20,30,40,50,60,70 and {10,20,20,30,30,30,40,50,50, 60, 70, 70,70};
		
		List<Integer> al=new ArrayList<Integer>();
		Set<Integer> st=new TreeSet<Integer>();
		al.add(10);
		al.add(20);
		al.add(20);
		al.add(30);
		al.add(30);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(70);
		al.add(70);
		
		for(int a:al) {
			System.out.println(a);
		}
		System.out.println("---------------------------------------");
		
		for(int i=0;i<al.size();i++) {
			st.add(al.get(i));
		}
		for(int b:st) {
			System.out.println(b);
		}
		
	}

}
