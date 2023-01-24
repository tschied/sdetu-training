package oop;

public class BankAccount implements IRate {
	
	String accountNumber;
	private String name;
	private String ssn;
	String accountType;
	double balance;
	
	// static means: variable belongs to the class itself, not to the instantiated object
	// static final would then even throw an error if one would want to change it
	private static final String routingNumber = "048392412";
	
	// Constructor definitions
	BankAccount(){
		System.out.println("Account created.");
		balance = 0;
	}
	
	// Overloading
	BankAccount(String accountType){
		System.out.println("Account created.\n   Type: " + accountType);
		balance = 0;
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("Account created.\n   Type: " + accountType + "\n   Deposit: $" + initDeposit);
		String Msg;
		if( initDeposit < 1000 ) {
			Msg = "Error: Minimum deposit must be at least $1000.";
		}
		else {
			Msg = "Thanks for your deposit.";
			balance = initDeposit;
		}
		System.out.println(Msg);
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = "Mr. " + name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	// Interface methods:
	@Override
	public void setRate() {
		System.out.println("SETTING RATE"); 
	}
	@Override
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	
	
	// define methods
	void deposit(double amount) {
		balance += amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance -= amount;
		showActivity("WITHDRAW");
	}
	
	private void showActivity(String activity) {
		System.out.println("Recent activity: " + activity);
		System.out.println("New balance: " + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance is: $"+balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ", ACCOUNTNUMBER: " + accountNumber + ", ROUTINGNUMBER: " + routingNumber + ", Balance: $" + balance + "]";
	}
	
}
