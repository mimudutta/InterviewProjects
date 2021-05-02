package PracticeProgramsCoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class SortingAlphabetusingLength {

		//Input = [“hello”, “Innovation”, “hi”,  “java”]
		//Output = [hi, java, hello, Innovation]
	
	public static void main(String[] args) {
		
		arrangeUsingMap();
		arrangeClasicMethod();
	}
	
	public static void arrangeClasicMethod() {
		String[] strArr={"hello", "Innovation", "hi",  "java"};
		String temp="";
		System.out.println("unsortedList:"+strArr);
		for(int i=0; i<strArr.length; i++) {
			for(int j=i+1; j<strArr.length; j++) {
				int ilen=strArr[i].length();
				int jlen=strArr[j].length();
				System.out.println("ilen---"+ilen);
				System.out.println("jlen---"+jlen);
				if(ilen<jlen ) {
					temp=strArr[i];
					System.out.println("temp---"+temp);
					strArr[i]=strArr[j];
					strArr[j]=temp;
					//System.out.println(lt);
				}
			}
			System.out.println(strArr[i]);
		}
		//System.out.println("ArrangedList:"+lt);
	}
	
	public static void arrangeUsingMap() {
		List<String> lt=new ArrayList<String>(Arrays.asList("hello", "Innovation", "hi",  "java"));
		List<String> ltnew=new ArrayList<String>();
		String temp="";
		Map<Integer,String> hm=new TreeMap<Integer,String>();
		
		for(int i=0; i<lt.size(); i++) {
				int ilen=lt.get(i).length();
				hm.put(lt.get(i).length(), lt.get(i));
			}
		
		System.out.println("Map:"+hm);
	
		Set<Map.Entry<Integer,String>> entrySet= hm.entrySet();
		Iterator<Map.Entry<Integer,String>> it =entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer,String> elements=it.next();
			System.out.println(elements.getValue());
		}
	}
	
}
