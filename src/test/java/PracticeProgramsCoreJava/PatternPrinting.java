package PracticeProgramsCoreJava;

public class PatternPrinting {

	public static void main(String[] args) {
		
		
// print right triangle		
		System.out.println("-----------print right angle triangle-----------");
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	


//print opposite right angle triangle
		System.out.println("----------print opposite right angle triangle---------------");
			for(int i=0;i<=10;i++) {
				for (int k=10;k>i;k--) {
					System.out.print(" ");
				}
					for(int j=0;j<=i;j++) {
						System.out.print("*");
					}	
				System.out.println();
			}

//print reverse triangle
	System.out.println("-----------print reverse triangle-----------");
		for(int i=0;i<=10;i++) {
			for(int j=10;j>i;j--) {
					System.out.print("*");
				}
			System.out.println();	
		}

		
//print acute angle triangle
		System.out.println("-----------print acute angle triangle-----------");
			for(int i=0;i<=10;i++) {
				for (int k=10;k>i;k--) {
					System.out.print(" ");
				}
					for(int j=0;j<=i;j++) {
						System.out.print(" *");
					}	
				System.out.println();
			}

}
}