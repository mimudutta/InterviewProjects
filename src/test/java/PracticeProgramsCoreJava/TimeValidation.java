package PracticeProgramsCoreJava;

public class TimeValidation {

	public static void main(String[] args) {
		

		//validTime("25:59");
		System.out.println(validTime("01:59"));
	}
	
	public static boolean validTime(String time) {
		
		String[] val= time.split(":");
		boolean flag1;
		boolean flag2;
		
	
		if((Integer.parseInt(val[0])>=0)&&(Integer.parseInt(val[0])<=24)) {
			flag1=true;
			System.out.println("valid");
		}
		else {
			flag1=false;
			System.out.println("Invalid");
		}
		
		if((Integer.parseInt(val[1])>=0)&&(Integer.parseInt(val[1])<=59)) {
			flag2=true;
			System.out.println("valid");
		}
		else {
			System.out.println("Invalid");
			flag2=false;
		}
		System.out.println(flag1+"    "+flag2);
		if(flag1&&flag2==true) {
			return true;
		}
		else {
			return false;
		}
		

	}

}
