package PracticeProgramsCoreJava;

import java.util.Arrays;

public class int10NumberNearAvg {
	
	//Pgm to find average and then find nearest number to the average from an array

	public static void main(String[] args) {
		int[] ip= {10,13,12,18,15,22,16}; //average
		int sum=0;
		int avg;
		Arrays.sort(ip);

		for(int i=0; i<ip.length; i++) {
			//System.out.println(ip[i]);
			sum=sum+ip[i];
		}
		avg=sum/ip.length;
		System.out.println("Average:"+avg);
		
		for(int i=ip.length-1;i>0; i--) {
			if(ip[i]<avg) {
				System.out.println("Lowest no. nearest to the Average is:"+ip[i]);
				break;
			}	
		
		}
		for(int i=0;i<ip.length; i++) {
			if(ip[i]>avg) {
				System.out.println("Higher no. nearest to the Average is:"+ip[i]);
				break;
			}	
		
		}
	}

}
