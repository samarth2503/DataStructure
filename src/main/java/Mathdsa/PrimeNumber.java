package Mathdsa;

public class PrimeNumber
{
	public static void main(String[] args)
	{	
		int n = 20;
		System.out.println(n+"=="+findPrime(n));
		
		for(int i=1;i<n;i++)
		{
			System.out.println(i+" == "+findPrimeNumberInRange(i));
		}
		
		boolean[] prime = new boolean[n+1];
		findPrimeNumberSieveMethod(n,prime);
	}
	
	public static boolean findPrime(int n)
	{	
		if(n<=1)
		{
			return false;
		}
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean findPrimeNumberInRange(int n)
	{
		if(n<=1)
		{
			return false;
		}
		
		int c = 2;
		
		while(c*c <=n)
		{
			if(n%c == 0)
			{
				return false;
			}
			c++;
		}
		
		return true;
	}
	
	public static boolean findPrimeNumberSieveMethod(int n,boolean[] prime)
	{
		if(n<=1)
		{
			return false;
		}
		
		int c = 2;
		
		for(int i=2;i*i<=n;i++)
		{
			if(!prime[i])
			{
				for(int j=i*2;j<=n;j+=i)
				{
					prime[j] = true;
				}
			}
		}
		
		for(int k=2;k<n;k++)
		{
			if(!prime[k])
			{
				System.out.print(k+" ");
			}
		}
		
		return true;
	}
	
	
	
}

