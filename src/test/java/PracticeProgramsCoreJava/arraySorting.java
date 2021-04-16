package PracticeProgramsCoreJava;

public class arraySorting {

	public static void main(String[] args) {
		int[] ip={10,6,3,7,8,1,12,2,5,4};
		 
		bubbleSort(ip); //Sorting using bubble sort

		for(int i=0;i<ip.length-1;i++){  //for printing the array
		System.out.println(ip[i]);
		}
		
		
		System.out.println("Max Number: "+getMax(ip));
	}

	public static int[] bubbleSort(int[] ip) {
		
		int temp;
		for(int i=0;i<ip.length-1;i++){
			for(int j=i+1;j<ip.length-1;j++) {
				if(ip[i]>ip[j]){
					temp=ip[i];
					ip[i]=ip[j];
					ip[j]=temp;
				}
			}	
		}
		return ip;
		
	}


//Program to get max number in an array
	public static int getMax(int[] ip) {
		int ans = ip[0];
		for (int i = 0; i < ip.length; i++) {
			if (ans < ip[i]) {
				ans = ip[i];
			}
		}
		return ans;
	}
}


