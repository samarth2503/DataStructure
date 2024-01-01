package LeetcodeProblems;

public class RemoveNonAlphanumericCharcter {

	public static void main(String[] args) {
		
		String str = "Geeks_for$ Geeks?{}[]";
		usingRegex(str);
		usingCharcter(str);
		usingASCII(str);
		//System.out.println(str);

	}
	
	public static void usingRegex(String str)
	{
		String reg = "[^0-9a-zA-Z]";
		
		str = str.replaceAll(reg, "");
		
		System.out.println(str);
	}
	
	public static void usingCharcter(String str)
	{
		String s = "";
		for(char c : str.toCharArray())
		{
			if(Character.isDigit(c) || Character.isAlphabetic(c))
			{
				s+= Character.toString(c);
			}
			else {
				continue;
			}
		}
		
		System.out.println(s);
	}
	
	public static void usingASCII(String str)
	{
		String s = "";
		for(char c : str.toCharArray())
		{
			if((c > '0' && c < '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
			{
				s+= Character.toString(c);
			}
			else {
				continue;
			}
		}
		
		System.out.println(s);
	}
	

}
