package Recursion;

public class FibonacciNumber {

	public static void main(String[] args) {
		
		int n = 50;
		//diff(n);
		System.out.println(fiboNum(n));
	}
	
	public static int fiboNum(int n)
	{
		if(n<2)
		{
			return n;
		}
		
		return fiboNum(n-1)+fiboNum(n-2);
	}
	
	public static void diff(int n)
	{
		diff(n-3);
		System.out.println(n);
	}

}
