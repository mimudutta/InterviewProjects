package PracticeProgramsCoreJava;

public class FindMissingNumber {

	public static void main(String[] args) {
		Integer[] ip= {1,2,3,4,5,7,8,9};
		System.out.println(missingOneNumber(ip));
	}
	
	public static int missingOneNumber(Integer[] ip) {
		int expSum = 0;
		int actSum = 0;
		int arrlength=ip.length;
		System.out.println("Size:"+arrlength);
		for(int i=0; i<arrlength; i++) {
			actSum=actSum+ip[i];
		}
		System.out.println(actSum);
			
		expSum=(arrlength+1) *(arrlength+1+1)/2;   //sum of n natural number=n(n+1)/2
		System.out.println(expSum);
		
		return expSum-actSum;
	}

}
