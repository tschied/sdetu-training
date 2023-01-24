package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("656434798" , 1000.50 );
		BankAccount acc2 = new BankAccount("373984270" , 2000 );
		BankAccount acc3 = new BankAccount("482628179" , 2500 );
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		
		acc1.accrue();
		
		System.out.println(acc1.toString());
		
		
	}

}


class BankAccount implements IInterest{
	private static int ID = 1001;					// internal ID
	private String accountNumber;	// ID ++ random 2-digit number + first 2 digits of SSN
	private static final String routingNumber = "0045400657";
	private String name;
	private String SSN;
	private double balance;
	
	// Constructors
	public BankAccount(String SSN)
	{
//		System.out.println("New Account Created.");
		this.SSN = SSN;
		ID++;
//		System.out.println(ID);
		setAccountNumber();
	}
	
	
	public BankAccount(String SSN, double initDeposit )
	{
		balance = initDeposit;
//		System.out.println("New Account Created.");
		this.SSN = SSN;
		ID++;
//		System.out.println(ID);
		setAccountNumber();
	}
	
	
	
	private void setAccountNumber() {
		int random = (int)(Math.random() * 100);
		accountNumber = ID + "" + random + SSN.substring(0,2);
		System.out.println("Your account number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	
	public void payBill(double amount) {
		balance -= amount;
		System.out.println("Paying bill "+amount);
		showBalance();
	}
	public void makeDeposit(double amount) {
		System.out.println("Making deposit "+amount);
		balance += amount;
		
		showBalance();
	}
	
	
	public void showBalance() {
		System.out.println("Balance: "+balance);
	}
	
	public void accrue() {
		balance*=1+rate/100;
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + " ]\n[Routing Number: " + routingNumber + " ]\n[Balance: " + balance + "]";
	}
	
}