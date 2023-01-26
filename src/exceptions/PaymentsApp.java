package exceptions;

import java.util.Scanner;

public class PaymentsApp {

	// take a payment from user
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double payment=0;
		boolean positivePymt = true;
		
		
		
		do
		{		
			// 1 ask user for input
			System.out.print("Enter payment amount: ");
			
			// 2 get amount and test value
			Scanner in = new Scanner(System.in);
	
			// 3 handle exceptions appropriately
			try
			{
				payment = in.nextDouble();	
				if(payment<0)
				{
					throw new NegativePaymentException(payment);
				}
				else
				{
					positivePymt = true;
				}
			}
			catch(NegativePaymentException e) //
			{
				System.out.println(e.toString());
				System.out.println("Please try again.");
				positivePymt = false;
			}
			
			in.close();
			
		} while(!positivePymt);
		
		
		
		// 4 print confirmation
		System.out.print("Thank you for your payment of $"+payment);
		

		
	}

}
