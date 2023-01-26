package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args)
	{
		// 1. Define the file path that we want to read
		String filename = "C:\\Users\\Tom\\eclipse-workspace\\JavaTraining\\files\\fileToWrite.txt";
		String message = "Writing data to the file";
				
		// 2. Create the file in Java
		File file = new File(filename);
		
		try
		{	
			// 3. Open the file
			FileWriter fw;
			fw = new FileWriter(file);
			
			// 4. Write to the file
			fw.write(message);
						
			// 5. Close the resources
			fw.close();

		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Error: could not read file: "+filename);
		}
		finally
		{
			System.out.println("Closing the filewriter");
		}

	}

}
