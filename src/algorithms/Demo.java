package algorithms;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {2,75,27,96,345,-45,9,-123};
		int[] sortedNums = {2,6,9,12,18,24,33,38,41,45,51,54,64,66,72,75,78,87,89,94};
		
		// call a function that searches for a specific number
		int queryIndex = algorithms.Search.linearSearch(numbers, -45);
		
		System.out.println("Linear search found number at position "+(queryIndex+1));
		

		// call the binary search
		int query = 94; 
		queryIndex = algorithms.Search.binarySearch(sortedNums, query, 0, sortedNums.length);
		System.out.println("Binary search found number at index "+(queryIndex));

		
		// Call bubble sorting method
		Sort.bubbleSort(numbers);

	}

}
