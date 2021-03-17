package PracticeProgramsCoreJava;



public class interview12 {

	public static void main(String[] args) {
		
		solution("BAAABAB"); //ip:"BAAABAB" /BBABAA/AABBBB    op:"AAABB"
		

	}
	
	public static int solution(String S) {
		StringBuffer sb=new StringBuffer(S) ;
		int count=0;
		//char[] ch=S.toCharArray();
		for(int i=0;i<sb.length()-1;i++) {
			if((sb.charAt(i)=='B')) {    
				sb.deleteCharAt(i);
				i--;
				count++;
				System.out.println(sb.toString());
				System.out.println(count);
			}
		}
		return count;
        
    }

}
