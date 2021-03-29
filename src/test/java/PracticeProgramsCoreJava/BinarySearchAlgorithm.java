package PracticeProgramsCoreJava;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		int[] arr = {12,89,80,7,5,31,99,2,1};
		
		int size=arr.length;
		System.out.println("Array Size:"+size);
		
		for(int i=0;i<arr.length;i++) {            //using classic method
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);         //After sorting if decending: 99,89,80,31,12,7,5,2,1	  
		}										//After sorting if accending: 1,2,5,7,12,31,80,89,99
		
		System.out.println("index for the given key is:"+BinarySearch(10,arr.length,arr));
		
		if(!(BinarySearch(10,arr.length,arr)==-1)) {
			System.out.println("index for the given key is:"+BinarySearch(10,9,arr));
		}
		else {
			System.out.println("key doesnot exist in the array:");
		}
		
	}
	
	public static int BinarySearch(int key,int size,int[] arr) {      //Search for 12 in the array
		int head=0;
		int r=size-1;
		int mid=(head+r)/2;
		
		while(head<=r) {
			if(key==arr[mid]){
				return mid;
			}
			else if(key<arr[mid]) {
				r=mid;
				
			}
			else  {
				head=mid+1;
			}
		}	
		return -1;
	}
}
