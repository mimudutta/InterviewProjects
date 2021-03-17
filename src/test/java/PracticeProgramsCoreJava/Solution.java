package PracticeProgramsCoreJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import org.mozilla.javascript.ast.Name;

class CharactersCount {
    private final String name;
    private final Integer distinctCharacterCount;
    
    public CharactersCount(String name, Integer distinctCharacterCount) {
        this.name = name;
        this.distinctCharacterCount = distinctCharacterCount;
    }
    
    @Override
    public String toString() {
        return "\"" + this.name + "\" has " + this.distinctCharacterCount + " distinct characters.";
    }
}

//=================================================
class Filter{
	public static Predicate<String> nameStartingWithPrefix(String prefix){
		Name.newString(prefix)
		
		return null;
		
	}
}

class Mapper{
	public static Function<String, CharactersCount> getDistinctCharactersCount(){
		
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
			  System.out.println("words:"+keyEl
		
		return null;
		
	}
}

//=================================================

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "aaryanna",
                "aayanna",
                "airianna",
                "alassandra",
                "allanna",
                "allannah",
                "allessandra",
                "allianna",
                "allyanna",
                "anastaisa",
                "anastashia",
                "anastasia",
                "annabella",
                "annabelle",
                "annebelle"
        );
        
        names.stream()
                .filter(Filter.nameStartingWithPrefix(scanner.nextLine()))
                .map(Mapper.getDistinctCharactersCount())
                .forEachOrdered(System.out::println);
    }
}