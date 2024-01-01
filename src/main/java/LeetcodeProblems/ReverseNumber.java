package LeetcodeProblems;

public class ReverseNumber {

	public static void main(String[] args) {
		
		System.out.println(reverNumber(21321));
	}
	
	public static long reverNumber(long num)
	{
		long sum = 0;
		
		while(num!=0)
		{
			long lastDigit = num%10;
			sum = sum*10 + lastDigit;
			num = num/10;
		}
		
		return sum;
	}

}
