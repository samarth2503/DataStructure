package LeetcodeProblems;

public class StringToInteger {

	public static void main(String[] args) {
		
		System.out.println(StringToNum("456"));
	}
	
	public static int StringToNum(String str)
	{
		int num = 0;
		int len = str.length();
		
		for(int i=0;i<len;i++)
		{
			num = (num * 10) + (int)str.charAt(i) - 48;
		}
		
		return num;
	}

}
