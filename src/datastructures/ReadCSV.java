package datastructures;

import java.util.List;
import java.util.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class ReadCSV {

	public static void main(String[] args)
	{
		// read data from a csv file 
		List<String[]> data = new ArrayList<String[]>();
		String dataRow;
		
		String filename = "C:\\Users\\Tom\\eclipse-workspace\\JavaTraining\\files\\accounts.csv";
		
//		File file = new File(filename);
		
		try
		{
			// open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));	// NOTE: FileReader also takes the path as an argument instead of a File object
			
			// read data as long as it is not empty
			while( (dataRow = br.readLine()) != null )
			{
				String[] line = dataRow.split(";"); 
				data.add(line);
			}
			
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String[] account : data)
		{
			for(String field : account)
				System.out.print(field+" ");
			System.out.print("\n");
		}
		
	}

}
