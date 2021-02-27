package PracticeProgramsCoreJava;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class InterviewQuestion {
	
	@Test(enabled=false)
	public void questionOne() {
		//1          1       0    1      1     --- 27
	//   2^4        2^3     0^2  2^1    2^0
	//2*2*2*2	  2*2*2    0*0   2       1
	//16	       8        0    2       1   --- 27
		
		int count=0;
		List<Integer> al =new ArrayList<> ();
		al.add(1);
		al.add(1);
		al.add(0);
		al.add(1);
		al.add(1);
		
		/*for(int a:al) {
			System.out.println(al);
		}*/
		//System.out.println(al.size());
		
		for(int i=0; i<al.size(); i++) {
			if(al.get(i)==1) {
				count=(int) (count+Math.pow(2,i));         //1+Math.pow()  
				//System.out.println(count);
				
			}
		}
		System.out.println("DecimalFormat:"+count);
		
	}
	
	@Test(enabled=true)
	public void questionTwo() {
		String str="Let's meet l8r 2nite?";
		
		StringBuffer newStr=new StringBuffer(str.replaceAll("[A-Za-z]","*"));
		System.out.println(newStr); //***'* **** *8* 2****?
								   //"*'* * *8* 2*?"
		
		/*for(int i=0;i<tempString.length;i++) {
			System.out.println(tempString[i]);
			
			if(Character.isLetter(tempString[i])&& Character.) {
				s2=s2+"*";
			}
			System.out.println(s2);*/
			/*String newStr=s.replaceAll("[A-Za-z]","*");
			System.out.println(newStr);*/
			for(int i=0;i<newStr.length()-1;i++) {
				if(newStr.charAt(i)==newStr.charAt(i+1)) {
					String s2="";
					newStr.deleteCharAt(i);
					System.out.println(newStr);  //**'* ** *8* 2**?
				}
					
				}
			//}
			
	//	}
		
		
	}

}
