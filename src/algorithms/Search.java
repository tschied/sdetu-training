package algorithms;

public class Search
{
	public static int linearSearch(int[] dataSet,int query)
	{
		for(int i=0;i<dataSet.length;i++)
			if(dataSet[i]==query)
				return i;		

		return -1;
	}
	
	
	public static int binarySearch(int[] dataSet,int query,int start,int end)
	{
		// binary search assumes a sorted array and can therefore continually split our search domain in half
		if(start==end)
			return -1;
		
		
		int middle = (int)((start+end)/2);

		int value = dataSet[middle];

		if( value == query )
		{
			return middle;
		}
		
		if( query > value )
		{
			System.out.println( query + ">" + value );
			return binarySearch( dataSet , query , middle+1 , end );
		}
		
		if( query < value )
		{
			System.out.println( query + "<" + value );
			return binarySearch( dataSet , query , start , middle-1 );
		}

		return -1;
	}
	
}
