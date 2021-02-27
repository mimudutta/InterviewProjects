package PracticeProgramsCoreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class MapPrograms {
	
	@Test
	//--------pgm to find duplicate string---------
	public void findDuplicateString() {
		String str="I love love java and and my country";
		String[] temp=str.split(" ");
		Map<String,Integer> hm=new HashMap<String, Integer>();
		
		for(String s:temp) {
			//System.out.println(s);
			if(hm.get(s)!=null) {
				hm.put(s,hm.get(s)+1);
			}
			else {
				hm.put(s,1);
			}
		}
		System.out.println("Map::"+hm);
		
		//-------Print keys using keyset---------
		Set<String> st=hm.keySet();
		Iterator<String> it=st.iterator();
		while(it.hasNext()) {
			//System.out.println("keys using keyset are:"+it.next());
			String keyElements=it.next();
			System.out.println("----------keyElements:----------"+keyElements);
			
			  if(hm.get(keyElements)>1) {
			  System.out.println("words:"+keyElements+" and count:"+hm.get(keyElements));
			  }
			 
		}
		//-------Print keys and values using entrySet---------
		Iterator<Map.Entry<String, Integer>> itr=hm.entrySet().iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry<String, Integer> elements=itr.next();
			System.out.println("Key:"+elements.getKey());
			System.out.println("Value:"+elements.getValue());
		}
		
	}

}
