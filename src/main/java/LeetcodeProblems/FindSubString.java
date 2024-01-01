package LeetcodeProblems;

public class FindSubString {

	public static void main(String[] args) {
		
		String s1 = "Naveen Automation labs";
		String s2 = "labs";
		
		System.out.println(isSubstringRegex(s1,s2));
		System.out.println(isSubstringRegex("automation","testing"));
		System.out.println(isSubstringRegex("automation","a"));
		
		System.out.println(s1.contains(s2));
		System.out.println(s1.indexOf(s2)!=-1);
		
		findAllSubString("abc");

	}
	
	public static boolean isSubstringRegex(String s1, String s2)
	{
		return s1.matches("(.*)"+s2+"(.*)");
	}
	
	// Find SubString from Given String
	public static void findAllSubString(String str)
	{
		for(int i=0; i<str.length();i++)
		{
			for(int j=(i+1);j<=str.length();j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
	}
	

}
