package LeetcodeProblems;

public class Fibonnaci {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 1;
		
		
		System.out.println(fibo(6));
		Fibbonacci(5);
		

	}
	
	public static int fibo(int n)
	{
		
		if(n ==1 || n ==2)
		{
			return 1;
		}
		//System.out.println(n);
		return fibo(n-1) + fibo(n-2);
		
		
	}
	
	public static void Fibbonacci(int n)
	{
		int x = 0;
		int y = 1;
		
		System.out.print(x+","+y);
		
		for(int i=1;i<n;i++)
		{
			int sum = x+y;
			System.out.print(","+sum);
			int temp = x;
			x = y;
			y = sum;
		}
	}

}
