package LeetcodeProblems;

public class FactorialUSingRecusrion {
	
	public static void main(String[] args)
	{
		System.out.println("Factorial of 5 is "+factorial(5));
		System.out.println(pallindrom("Samarth",0,6));
		
		//System.out.println((int)("samarth".length()/2));
	}
	
	public static int factorial(int n)
	{
		if(n == 0 || n ==1)
		{
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}
	
	public static boolean pallindrom(String str,int start, int end)
	{
		if(str.charAt(start) != str.charAt(end))
		{
			return false;
		}
		
		if(end<=start)
		{
			return true;
		}
		
		return pallindrom(str,start+1,end-1);
	
	}

}
