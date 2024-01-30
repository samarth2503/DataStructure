package LeetcodeProblems;

public class ReverseNumber {

	public static void main(String[] args) {
		
		//System.out.println(reverNumber(12345));
		reverUsingRecursion(563);
		System.out.println(calculatePowerOfNNumber(5,8));
		System.out.println(sumOfAlldigitUsingRec(5251));
		System.out.println(reverseString("Samarth","",6));
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
	
	public static void reverUsingRecursion(int num)
	{
		if(num<10)
		{
			System.out.println(num);
			return;
		}
		else {
			System.out.print(num%10);
			reverUsingRecursion(num/10);
		}
	}
	
	public static long calculatePowerOfNNumber(int base, int expo)
	{
		if(expo == 0)
		{
			return 1;
		}
		else if(expo % 2 == 0)
		{
			long res = calculatePowerOfNNumber(base, expo/2);
			return res * res;
		}
		else {
			return calculatePowerOfNNumber(base, expo-1) * base;
		}
	}
	
	public static int sumOfAlldigitUsingRec(int num)
	{
		if(num == 0)
		{
			return num;
		}
//		
//		int res = (num % 10);
//		int sum = res + 0;
		return sumOfAlldigitUsingRec(num / 10) + (num % 10);
		//System.out.println(sum);
		
	}
	
	public static String reverseString(String str,String r,int length)
	{
		if(length<0)
		{
			return r;
		}
		return reverseString(str, r+str.charAt(length),length-1);
	}


}
