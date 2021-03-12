package PracticeProgramsCoreJava;

import java.util.Scanner;


public class interview8 {
	
	//ip: 171.21.34.200 //0-255
	//   0-255
	//OP: nothing--not proper ip.
	
	public static void main(String args[]) {
		Scanner scnScanner=new Scanner(System.in);
		String address =null;
		try {
			address = scnScanner.next();
		} catch (NumberFormatException e) {
			System.out.println("Please Enter number in ipv4 address format only!"+ e);
			//e.printStackTrace();
		}
		  
		//System.out.println(ValidationChain("171.21.34.200"));
		
		if(ValidationChain(address)==true) {
			System.out.println("valid IP");
		}
		else {
			System.out.println("Invalid IP! Please Enter number in ipv4 address format only");
		}
		
	}
	public static boolean ValidationChain(String s) {
		String str=s;       
		boolean f1;
		boolean f2;
		boolean f3;
		boolean f4;
		String[] Array=str.split("\\.");
		
		/*
		 * for(int i=0;i<Array.length;i++) {
		 * if((Integer.parseInt(Array[i])<=255)&&(Integer.parseInt(Array[i])>=0)) {
		 * f1=true; }else { f1=false; } }
		 */
		
		if((Integer.parseInt(Array[0])<=255)&&(Integer.parseInt(Array[0])>=0)) {
			  f1=true; 
			}else { 
				f1=false; 
			} 
		
		if((Integer.parseInt(Array[1])<=255)&&(Integer.parseInt(Array[1])>=0)) {
			  f2=true; 
			}else { 
				f2=false; 
			} 
		
		if((Integer.parseInt(Array[2])<=255)&&(Integer.parseInt(Array[2])>=0)) {
			  f3=true; 
			}else { 
				f3=false; 
			} 
		
		if((Integer.parseInt(Array[3])<=255)&&(Integer.parseInt(Array[3])>=0)) {
			  f4=true; 
			}else { 
				f4=false; 
			} 
		
		System.out.println(f1+" "+f2+" "+f3+" "+f4);
		if(f1&&f2&&f3&&f4==true) {
			return true;
		}
		else {
			return false;
		}	
		
	}	

}

//10.0.0.40-----valid
//171.21.34.256-----invalid
//171.21.256.255-----invalid
//171.256.21.255-----invalid
//256.255.21.255------invalid
//abcd-------invalid

