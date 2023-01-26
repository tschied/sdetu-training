package labs;

import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CreditCardStatementReader {

	public static void main(String[] args)
	{
		List<String[]> transactions = new ArrayList<String[]>();
		String	dataRow;
		String filename = "C:\\Users\\Tom\\eclipse-workspace\\JavaTraining\\files\\transactions.csv";
		
		
		// 1. load transaction data
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			while( (dataRow=br.readLine())!=null )
			{
				String[] fields = dataRow.split(";");
				transactions.add(fields);
			}		
			
			br.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		// 2. make transactions to some CreditAccount
		
		double initBalance = -1000;
		CreditAccount ca = new CreditAccount(initBalance);
		
		for(String[] transaction : transactions)
		{
			System.out.println("-------------------------");
			String type = transaction[1];
			double amount = Double.parseDouble(transaction[3]);
			
			if(type.contentEquals("CREDIT"))
			{
				ca.credit(amount);
			}
			if(type.contentEquals("DEBIT"))
			{
				ca.debit(amount);
			}
			
			double balance = ca.getBalance();
			
			if( balance > 0 )
			{
				double fee = 0.1*balance;
				System.out.println("Charging 10% fee: $" + fee);
				ca.credit(fee);
				System.out.println("New balance: $" + ca.getBalance());
			}
			
			if( balance == 0 )
			{
				System.out.println("Thank you for your payments. Balance: $" + ca.getBalance());
			}
			
			if( balance < 0 )
			{
				System.out.println("Thank you for you payment. Current overpayment: " + ca.getBalance());
			}
			
		}
		
		System.out.println("-------------------------");
		System.out.println("Transactions finished.");
		
	}
	
}


class CreditAccount
{
	private double balance;
	
	CreditAccount(double initBalance)
	{
		this.balance = initBalance;
		System.out.println("Initial balance: "+balance);
	}
	
	public void credit(double amount)
	{
		System.out.println("Credit: "+amount);
		balance+=amount;
	}
	
	public void debit(double amount)
	{
		System.out.println("Debit: "+amount);
		balance-=amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
}