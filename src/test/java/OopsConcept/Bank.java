package OopsConcept;

public class Bank  implements GovOfIndia {
	
	public void transfer() {
		System.out.println("in bank");
	}
	
	public void homeLoan() {
		
		System.out.println("Bank Loan");
	}
	
	public void carLoan() {
		
		System.out.println("Bank Loan");
		
	}

	public void personalLoan() {
		
		System.out.println("Bank Loan");
		
	}

	@Override
	public void covid() {  ////method overriding
		System.out.println("GovOfIndia order: Implement lockdown");
		
	}
	
	
	

}
