package LeetcodeProblems;

public class StringToInteger {

	public static void main(String[] args) {
		
		System.out.println(StringToNum("456"));
	}
	
	public static int StringToNum(String str)
	{
		int sum = 0;
		
		for(int i=0;i<str.length();i++)
		{
			sum = (sum*10) + (int)str.charAt(i) - 48;
		}
		
		return sum;
	}

}
