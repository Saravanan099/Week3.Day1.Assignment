package Week3.Day1.Assignment3;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("This is my Deposit account-AxisBank");
	}
	
	public static void main(String[] args) {
		//override deposit Axisbank class method by Bankifo
	    BankInfo Bank=new BankInfo();
	    Bank.deposit();
	    
		//BankInfo Axisbank=new AxisBank();		
		//Axisbank.deposit();	
		
		
		
	}
}
