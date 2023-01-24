package basics;

public class NumbersCalc {
	
	public static void main(String[] args){
		printName();
		
		int numA = 4;
		int numB = 7;
		
		addNumbers(numA,numB);
		int product = multiplyNumbers(4,7);
		System.out.println(numA + " * " + numB + " ergibt " + product);
	}
	
	
	static void printName() {
		System.out.println("My name is Tim.");
	}
	
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println(numberA + " + " + numberB + " ergibt " + sum);
	}

	static int multiplyNumbers(int numberA, int numberB) {
		return numberA*numberB;
	}
	
}
