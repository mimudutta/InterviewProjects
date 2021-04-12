package PracticeProgramsCoreJava;


public class AddDigitsNum {
	
	public static int addTwoDigits(int n) {
		String num=Integer.toString(n);       //convert integer to string
		String[] arr=num.split("");
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+Integer.parseInt(arr[i]);   //convert String to integer before adding
		}
		
		return sum;
	    
	}

	public static void main(String[] args) {
		
		System.out.println("Addition is:"+addTwoDigits(55));
	}

	

}
