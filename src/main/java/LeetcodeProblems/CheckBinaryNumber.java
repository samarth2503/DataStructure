package LeetcodeProblems;

public class CheckBinaryNumber {

	public static void main(String[] args) {
		
		isBinary(10);
		isBinUsingRegex(256);

	}
	
	public static void isBinary(int number)
	{
		boolean isBin = true;
		int n = number;
		while(number!=0)
		{
			int rem = number % 10;
			
			if(rem >1)
			{
				isBin = false;
				break;
			}
			else {
				number = number / 10;
			}
		}
		
		if(isBin) {
			System.out.println(n + " is a Binary Number...");
		}else {
			System.out.println(n + " is not a Binary Number...");
		}
	}
	
	public static void isBinUsingRegex(int number)
	{
		if(String.valueOf(number).matches("[0-1]+")) {
			System.out.println(number +" is a binary number");
		}
		else {
			System.out.println(number +" is not a binary number");
		}
	}

}
