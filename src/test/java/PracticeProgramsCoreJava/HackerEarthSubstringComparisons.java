package PracticeProgramsCoreJava;



public class HackerEarthSubstringComparisons {
    public static void main(String[] args) {
        System.out.println(getSmallerAndLarger("BAAABAB", 3));
    }
    
    public static String getSmallerAndLarger(String s, int k){
    	String current_subString=s.substring(0, k);
    	String smallest=current_subString;
    	String largest=current_subString;
    	
    	for(int i=1; i<=s.length()-k; i++) {
    		current_subString=s.substring(i,i+k);
    		if(current_subString.compareTo(largest)>0) {
    			largest=current_subString;
    		}
    		if(current_subString.compareTo(smallest)<0) {
    			smallest=current_subString;
    		}
    		
    	}
      
        return smallest + "\n" + largest;
    
    }
}