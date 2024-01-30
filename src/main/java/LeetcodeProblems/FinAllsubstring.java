package LeetcodeProblems;

public class FinAllsubstring {

	public static void main(String[] args) {
		
		String str = "abc";
		findAllsubString(str);

	}
	
	public static void findAllsubString(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=(i+1);j<=s.length();j++)
			{
				System.out.println(s.substring(i,j));
				
			}
		}
	}

}
