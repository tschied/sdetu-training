package labs;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// Read a text file and retrieve the phone number

		// C:\Users\Tom\eclipse-workspace\JavaTraining\files\phoneNumber.txt
		String		filename	= "C:\\Users\\Tom\\eclipse-workspace\\JavaTraining\\files\\phoneNumber.txt";
		String[]	phoneNums	= new String[12];
		String		phoneNum	= null;
		File		file		= new File(filename);

		
		try
		{
			BufferedReader	br = new BufferedReader(new FileReader(file));
			for(int i=0;i<12;i++)
			{
				phoneNums[i] = br.readLine();
			}
			br.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error: File not found: " + filename);
			System.out.println("Exiting program.");
			return;
		}
		catch (IOException e)
		{
			System.out.println("Error: Could not read file: " + filename);
			System.out.println("Exiting program.");
			return;
		}
		
		// Valid phone number: 10 digits long
		// Area code cannot start with 0 or 9
		// There can be 911 in the phone
		
		for(int i=0;i<12;i++)
		{
			phoneNum = phoneNums[i];
			try
			{
				if( phoneNum.length() != 10 )
				{
					throw new TenDigitsException(phoneNum);
				}
				
				if( phoneNum.substring(0,1).equals("0") || phoneNum.substring(0,1).equals("9") )
				{
					throw new AreaCodeException(phoneNum);
				}
				
				if( phoneNum.contains("911") )
				{
					throw new EmergencyException(phoneNum);
				}
				
				System.out.println(phoneNum);
			}
			catch(TenDigitsException e)
			{
				System.out.println(e.toString());
			}
			catch(AreaCodeException e )
			{
				System.out.println(e.toString());
			}
			catch(EmergencyException e)
			{
				System.out.println(e.toString());
			}
		}
	}

}


class TenDigitsException extends Exception
{
	String num;
	
	TenDigitsException(String num)
	{
		this.num = num;
	}
	
	@Override
	public String toString()
	{
		
		return "TenDigitsError: Phone number "+num+" is "+num.length()+" digits long.";
	}
}

class AreaCodeException extends Exception
{
	String num;
	
	AreaCodeException(String num)
	{
		this.num = num;
	}
	
	@Override
	public String toString()
	{
		return "AreaCodeError: Phone number "+num+" starts with "+num.substring(0,1)+".";
	}
}

class EmergencyException extends Exception
{
	String num;
	
	EmergencyException(String num)
	{
		this.num = num;
	}
	
	@Override
	public String toString()
	{
		return "EmergencyError: Phone number "+num+" contains 911";
	}
}