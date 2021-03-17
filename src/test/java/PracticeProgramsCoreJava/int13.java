package PracticeProgramsCoreJava;

public class int13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//abaaba---aa
		//zyzyzyz--yzyzy
		System.out.println(solution("abaaba"));
	}
	
	public static int solution(String S) {
		
        // write your code in Java SE 8
		
		StringBuffer sb=new StringBuffer(S) ;
		int count=0;
		for(int i=0;i<sb.length()-1;i++) {
			if((sb.charAt(i)=='b')) {
				count++;
			}
		}
		return count;
		
    }
	

}
