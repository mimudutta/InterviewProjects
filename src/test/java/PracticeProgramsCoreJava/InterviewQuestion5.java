package PracticeProgramsCoreJava;


public class InterviewQuestion5 {

	public static void main(String[] args) {

		 //I/P : aaaabbbccaabbc
		// O/P : a4b3c2a2b2c1
		
		String string="aaaabbbccaabbc";
		char[] ch=string.toCharArray();
		int count=1;
		
		
		for(int i=0;i<ch.length;i++) {
			 
			 if(i+1<ch.length && ch[i]== ch[i+1]){
				 count++;
				}
			 else {
				System.out.print(ch[i]);
				System.out.print(count);
				count=1;	
			
			 	}

			}
		
		}
	

}
