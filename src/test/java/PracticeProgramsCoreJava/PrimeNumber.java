package PracticeProgramsCoreJava;

import org.testng.annotations.Test;

public class PrimeNumber {

	//============Prime Number between 1 to 100============
	@Test(enabled=false)
	public void findPrime() {
		int uptoNum=100;
		int temp=0;
		int count=0;
		for(int i=0;i<uptoNum;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					temp=temp+1;
					break;
				}
				else {
					temp=0;
				}
			}
			if (temp==0) {
				count++;
				System.out.println("Prime Number between 1 to 100 are:"+i);
			}	
		}
		System.out.println("Prime Number count between 1 to 100:"+count);
		
	}
	
	//============Prime Number between 1 to 100============
		@Test
		public void isPrime() {
			int Num=24;
			int temp=0;
			
			for(int i=2;i<Num/2;i++) {
				if(Num%i==0) {
					temp=1;
					break;
				}
				else {
					temp=0;
				}
				
				if(temp==0) {
					System.out.println("Number is prime");
				}
				else {
					System.out.println("Number is not prime");
				}
			}
		}
}


