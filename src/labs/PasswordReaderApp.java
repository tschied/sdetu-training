package labs;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PasswordReaderApp {

	public static void main(String[] args) {
		
		int nLines = 13;
		String[] passwords = new String[nLines];
		String password = null;
		
		String filename = "C:\\Users\\Tom\\eclipse-workspace\\JavaTraining\\files\\passwords.txt";
		
		File file = new File(filename);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(int i=0;i<nLines;i++)
			{
				passwords[i] = br.readLine();
			}
			br.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR File not found: "+filename);
		}
		catch (IOException e) {
			System.out.println("ERROR File could not be read: "+filename);
		}
		
		
		String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
		
		String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
							"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		String[] special = {"!","@","#","%",":",";","_"};	// and so on...
		
		for(int i=0;i<nLines;i++)
		{
			
			try
			{
				password = passwords[i];
				
				// number
				boolean containsNumber = false;
				for(int j=0;j<numbers.length;j++)
				{
					if(password.contains(numbers[j]))
					{
						containsNumber = true;
						break;
					}
				}
				if(!containsNumber)
					throw new NumberException(password);
				
				// letter
				boolean containsLetter = false;
				for(int j=0;j<letters.length;j++)
				{
					if(password.contains(letters[j]))
					{
						containsLetter = true;
//						break;
					}
				}
				if(!containsLetter)
					throw new LetterException(password);
				
				
				// special character
				boolean containsSpecial = false;
				for(int j=0;j<special.length;j++)
				{
					if(password.contains(special[j]))
					{
						containsSpecial = true;
//						break;
					}
				}
				if(!containsSpecial)
					throw new SpecialCharException(password,special);
				
				System.out.println("Password "+password+" validated");

			}
			catch(NumberException e)
			{
				System.out.println(e.toString());
			}
			catch(LetterException e)
			{
				System.out.println(e.toString());
			}
			catch(SpecialCharException e)
			{
				System.out.println(e.toString());
			}
			
		}

	}

}


class NumberException extends Exception
{
	String word;
	
	NumberException(String word)
	{
		this.word = word;
	}
	
	@Override
	public String toString()
	{
		return "ERROR: "+word+" does not contain a number.";
	}
}


class LetterException extends Exception
{
	String word;
	
	LetterException(String word)
	{
		this.word = word;
	}
	
	@Override
	public String toString()
	{
		return "ERROR: "+word+" does not contain a letter.";
	}
}


class SpecialCharException extends Exception
{
	String word;
	String[] special;
	
	SpecialCharException(String word,String[] special)
	{
		this.word = word;
		this.special = special;
	}
	
	@Override
	public String toString()
	{
		String message = "ERROR: "+word+" does not contain at least one of the special characters ";
		for(int i=0;i<special.length;i++)
			message = message + "\"" +  special[i]  + "\",";
		return message;
	}
}