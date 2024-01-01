package LeetcodeProblems;

public class PanagramChecker {

	public static void main(String[] args) {

		String s = "The quick brown fox jumps over the lazy dog";
		
		
		if(checkPanagram2(s))
		{
			System.out.println("It is Panagram");
		}
		else {
			System.out.println("Not a Panagram");
		}
	}
	
	// 1st Way
	public static boolean checkPanagram(String str)
	{	
		int index = 0;
		boolean b[] = new boolean[26];
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				index = str.charAt(i) - 'A';
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
			{
				index = str.charAt(i) - 'a';
			}
			
			b[index] = true;
		}
		
		for (int j=0;j<26;j++)
		{
			if(!b[j])
			{
				return false;
			}
		}
		return true;
	}
	
	// 2nd Methdo
	public static boolean checkPanagram2(String str)
	{	
		char[] c = str.toCharArray();
		boolean b[] = new boolean[26];
		
		for (char ch : c)
		{
			if(ch >= 'A' && ch <= 'Z')
			{
				b[ch - 'A'] = true;
			}
			else if(ch >= 'a' && ch <= 'z')
			{
				b[ch - 'a'] = true;
			}
		}
		for (int j=0;j<26;j++)
		{
			if(!b[j])
			{
				return false;
			}
		}
		return true;
	}

}
