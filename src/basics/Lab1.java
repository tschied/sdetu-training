package basics;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum_rec(5));
		System.out.println(sum_lin(5));
		System.out.println(fac(6));
		
		double[] arr = {3,7,1,6};//,4,7,9,12,19,2}; 
		System.out.println(arr.length);
		System.out.println("min:" + min(arr));
		System.out.println("max:" + max(arr));
		System.out.println("avg:" + avg(arr));
		
	}

	
	public static int sum_lin(int n) {
		int s = 0;
		for(int i=1;i<=n;i++)
			s = s+i;
		return s;
	}
	
	public static int sum_rec(int n) {
		if(n==1)
			return 1;	
		return n + sum_rec(n-1);
	}
	

	
	public static int fac(int n) {
		if(n==0)
			return 1;
		return n * fac(n-1);
	}
	
	
	public static double min(double[] arr) {
		double m = arr[0];
		int L = arr.length;
		for(int i=1;i<L;i++)
			if(arr[i]<m)
				m=arr[i];
		return m;
	}
	
	public static double max(double[] arr) {
		double m = arr[0];
		int L = arr.length;
		for(int i=1;i<L;i++)
			if(arr[i]>m)
				m=arr[i];
		return m;
	}
	
	public static double avg(double[] arr) {
		double s = 0;
		int L = arr.length;
		for(int i=0;i<L;i++)
			s = s + arr[i];
		return s/L;
	}
	
	
}


