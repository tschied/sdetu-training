package algorithms;

public class Sort {
	
	
	public static void bubbleSort(int[] dataSet)
	{
//		bubbleSort_looped(dataSet);
		bubbleSort_reccursive(dataSet);
	}
	
	
	private static void bubbleSort_looped(int[] dataSet)
	{
		boolean swapped = false;
		do
		{
			swapped = false;
			for( int i=0 ; i<dataSet.length-1 ; i++ )
				if(dataSet[i]>dataSet[i+1])
				{
					int temp = dataSet[i];
					dataSet[i] = dataSet[i+1];
					dataSet[i+1] = temp;
					swapped = true;
					printArr(dataSet);
				}
		} while(swapped);
	}
	
	
	
	
	private static void bubbleSort_reccursive(int[] dataSet)
	{
		boolean swapped = false;
		for( int i=0 ; i<dataSet.length-1 ; i++ )
			if(dataSet[i]>dataSet[i+1])
			{
				int temp = dataSet[i];
				dataSet[i] = dataSet[i+1];
				dataSet[i+1] = temp;
				swapped = true;
			}

		if(swapped)
		{
			printArr(dataSet);
			bubbleSort(dataSet);
		}
	
	}
	
	private static void printArr(int[] arr)
	{
		System.out.print("[ ");
		for( int i=0 ; i<arr.length ; i++ )
			System.out.print(arr[i]+" ");
		System.out.print("]\n");
	}

}
