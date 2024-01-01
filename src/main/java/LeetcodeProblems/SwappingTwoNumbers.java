package LeetcodeProblems;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 10;
		
		int t = a;
		a = b;
		b = t;
		
		System.out.println(a+" "+b);
		withOutthridVaribale(20,10);
		withOutthridVaribale2(60,50);

	}
	
	public static void withOutthridVaribale(int a ,int b)
	{
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a +" "+b);
	}
	
	public static void withOutthridVaribale2(int a ,int b)
	{
		a = a*b;
		b = a/b;
		a = a/b;
		
		System.out.println(a +" "+b);
	}
	
	public static void bitWiseOperator(int a ,int b)
	{
		a = a^b;		// 10^20 = 30
		b = a^b;		// 30^20 = 10
		a = a^b;		// 30^10 = 20
		
		System.out.println(a +" "+b);
	}
	
	

}
