package OopsConcept;

public class HDFCbank extends Bank{
	
	public void transfer() {    //method overriding
		System.out.println("in HDFCbank");
	}
	
	@Override
	public void homeLoan() {    //method overriding
		
		System.out.println("HDFCbank homeLoan");
	}

	@Override
	public void carLoan() {		//method overriding
		
		System.out.println("HDFCbank carLoan");
		
	}

	@Override
	public void personalLoan() {	//method overriding
		
		System.out.println("HDFCbank personalLoan");
		
	}

	
	

}
