package OopsConcept;

public class client extends HDFCbank{

	public static void main(String[] args) {
		
		Bank bank=new Bank();
		bank.transfer();        //In Bank
		bank.carLoan();			//Bank Loan
		bank.covid();			//GovOfIndia order: Implement lockdown
		
		HDFCbank hdbank=new HDFCbank();
		hdbank.transfer();      //in HDFCbank
		hdbank.carLoan();		//HDFCbank carLoan
		hdbank.covid();			//GovOfIndia order: Implement lockdown
		
		Bank bank1=new HDFCbank();
		bank1.transfer();      //in HDFCbank
		bank1.carLoan();		//HDFCbank carLoan
		bank1.covid();			//GovOfIndia order: Implement lockdown
		
		HDFCbank hdbank1=(HDFCbank) new Bank();  //compilation error HDFCbank hdbank1=new Bank(); 
		hdbank1.transfer();  // ClassCastException:
		
		

	}

}
