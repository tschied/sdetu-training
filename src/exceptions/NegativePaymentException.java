package exceptions;

public class NegativePaymentException extends Exception
{
	// Define class variable
	double payment;
	
	// 1. Constructor that takes the value that would throw the exception 
	// 2. Assign Value of local variable
	public NegativePaymentException(double payment)
	{
		this.payment = payment;
	}
	
	// 3. Override the toString
	public String toString()
	{
		return "Error: Cannot take negative payment "+payment;
	}
	
}
