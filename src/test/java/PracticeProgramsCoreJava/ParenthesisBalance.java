package PracticeProgramsCoreJava;

import java.util.Stack;

import org.testng.annotations.Test;

public class ParenthesisBalance {
	
	@Test
	public void ParenthesisBalancecheck() {
		String str="[{()}]";
		
		Stack<Object> st=new Stack<Object>();
		
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)=='[')||(str.charAt(i)=='{')||(str.charAt(i)=='(')) {
				st.push(str.charAt(i));
			}
			else if ((!st.empty())&&(
					(str.charAt(i)==']'||
					 str.charAt(i)=='}'||
					 str.charAt(i)==')'))) {
				st.pop();
			}
			else {
				st.push(str.charAt(i));
			}
		}
		
		if(st.empty()) {
			System.out.println("Experssion is Balanced.");
		}
		else {
			System.out.println("Experssion is not Balanced.");
		}
		
		
	}

}
