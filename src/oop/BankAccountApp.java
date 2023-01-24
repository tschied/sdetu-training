package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// creating a new bank account 
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "394672";
		acc1.setName("Roger Hue");
		System.out.println("Name is: " + acc1.getName());
		acc1.setSsn("93722935");
		System.out.println("SSN is: " + acc1.getSsn());
		acc1.balance = 10000;
		System.out.println(acc1.toString());
		
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		System.out.println(acc1.toString());
	
/*
		BankAccount acc2 = new BankAccount("Checking Account");

		BankAccount acc3 = new BankAccount("Savings Account",5000);
		acc3.accountNumber = "0243543256";
		acc3.checkBalance();
		
		CDAccount cd1 = new CDAccount();
		cd1.setName("Juan");
		cd1.interestRate = "4.5";
		cd1.balance = 3000;
		cd1.accountType = "CDAccount";
		System.out.println(cd1.toString());
		cd1.compound();
*/
	}
	
}
