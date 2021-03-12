package PracticeProgramsCoreJava;

public class interview11FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fizzBuzz(15);
	}

	
	public static void fizzBuzz(int n) {
	    // Write your code here
	    for(int i=1;i<=n;i++){
	        if (!(i%3==0)&&!(i%5==0)){
	            System.out.println(i);
	    		}
	        else if((i%3==0)&&!(i%5==0)){ 
	        	System.out.println("Fizz"); 
            	}
	        else if(!(i%3==0)&&(i%5==0)){
	        	System.out.println("Buzz"); 
            	}
	        else if((i%3==0)&&(i%5==0)){ 
	            System.out.println("FizzBuzz"); 
	        	}
	        
	        }
	    
	}
}
