package LeetcodeProblems;

public class SubSequenceStirng {
	
	public static void main(String[] args)
	{
		String str = "abc";
		getSubString(str,"");
	}
	
	public static void getSubString(String str, String ans)
	{
		if(str.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		
		getSubString(str.substring(1),ans+str.charAt(0));
		
		getSubString(str.substring(1),ans);
	}

}
