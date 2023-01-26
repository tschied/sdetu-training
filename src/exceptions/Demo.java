package exceptions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 0;

		doMath(a,b);
		
		System.out.println("Program continues..");
	}
	
	public static void doMath(int a, int b) {
		double c = answer(a,b);
		System.out.println(c);
	}
	
	public static double answer(int x, int y)
	{
		// catch error HERE
		return x/y;
	}

}
