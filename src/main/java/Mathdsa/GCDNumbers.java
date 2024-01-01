package Mathdsa;

public class GCDNumbers {

	public static void main(String[] args) {
		
		
		System.out.println(findGCD(2,4));
	}
	
	public static int findGCD(int a, int b)
	{
		if(a==0)
		{
			return b;
		}
		
		return findGCD(b%a,a);
	}

}
