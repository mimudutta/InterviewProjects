package PracticeProgramsCoreJava;

import java.awt.Checkbox;

public class UsernameChecker {
	
	
    public static boolean validate(String username) {
       //throw new UnsupportedOperationException("Waiting to be implemented.");
    	String spCh = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        Boolean fl = null;
        
        
        	for(int k=0; k<username.length(); k++) {
        	char ch=username.charAt(k);
        		
        		if(username.length()>5) {           //check UN must be 4 ch long
                	if(((username.charAt(0)>='a' && username.charAt(0)<='z')  
                	|| (username.charAt(0)>='A' && username.charAt(0)<='Z')) 
                	&& (username.charAt(username.length()-1)!='_')) {		//check UN must start with letter and mustnot end with underscore
                		
                    	//if(spCh.contains(Character.toString(ch))           //UN must contain leters and no. and one special character
                		if((username.charAt(k)=='_') 
                    	|| ((username.charAt(k)>='a' && username.charAt(k)<='z') 
                    	|| (username.charAt(k)>='A' && username.charAt(k)<='Z')) 
                    	&& (username.charAt(k)>='0' && username.charAt(k)<='9')){
                            fl= true;
                            break;
                        }   
                    	else if(k == username.length()-1) {
                    		fl= false;
                    	}
                	}
                	else {
                		fl=false;
					}
        		}
                else {
            			fl=false;
            		}    		
        }
    
		return fl;
    }
    
    public static void main(String[] args) {
    	//validate("Mike Standish");
        System.out.println(validate("Mike_Standish")); // Valid username
        System.out.println(validate("Mike Standish")); // Invalid username
        System.out.println(validate("Mim"));
        System.out.println(validate("9imwerk_sq!2"));
        System.out.println(validate("9imwerk_sq!2_"));
        System.out.println(validate("imwerk_sq2"));
        System.out.println(validate("Abcd_efgZ"));
        System.out.println(validate("_Abcd12"));
    }
}
