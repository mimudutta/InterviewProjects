package PracticeProgramsCoreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//Integer[] arr={5,4,3,1,9,8,7};  //5,4,3,2,1,9,8,7,6
		
		//System.out.println(isArmstrongNumber(371));
		System.out.println(FindArmstrongNumber());
		//FindArmstrongNumber();
	}
	
	//-------Logic------
	//371=3x3x3 + 7x7x7 +1x1x1  // between(200-500)
	//      27  + 343 + 1 =371
	
	public static boolean isArmstrongNumber(int ip) {
		int temp = 0;
		int originalNo=ip;
		
		
			if(ip<0 || ip>500) {
				System.out.println("Enter valid number between 0-500");
			}
			else {
				while(ip!=0) {
					int a=ip %10;
					 System.out.println(a);
					 temp=temp+(int) Math.pow(a, 3);
					 //System.out.println(temp);
					 ip=ip/10;
					// System.out.println(ip);
					 //temp=temp+(int) Math.pow(b, 3);
					 System.out.println(temp);
				} 
			}
			if(temp==originalNo) {
				return true;
			}	
			else {
				return false;
			}		
	}
	
	
	public static List<Integer> FindArmstrongNumber(){ //List<Integer>
		List<Integer> lt=new ArrayList<Integer>();
		
		// Armstrong number between 200 to 500
//		for (int i = 200; i < 500; i++) {
//		int sum = 0;
//			int number=i;
//			while(number!=0) {
//				int remainder=number%10;
//				 sum=sum+(int) Math.pow(remainder, 3);
//				 number=number/10;
//			}
//			if (sum==i) {
//				System.out.println(i);
//				 lt.add(i);
//			}
//		}
//		//System.out.println(lt);
//		return lt;
		
		
		// Armstrong number between 0 to 500
		int count =0;
		for (int i = 0; i<500; i++){
	         int check, rem, sum = 0;
	         check = i;
	         while(check != 0) {
	            rem = check % 10;
	            sum = sum + (rem * rem * rem);
	            check = check / 10;
	         }
	         if(sum == i){
	        	 count++;
	            System.out.println(""+i+" is an Armstrong number.");
	            lt.add(i);
	         }
	      }
		System.out.println("Count of Armstrong number:"+count);
		return lt;
	}
}

