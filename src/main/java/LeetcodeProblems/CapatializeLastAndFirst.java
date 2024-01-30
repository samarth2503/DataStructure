package LeetcodeProblems;

public class CapatializeLastAndFirst {

	public static void main(String[] args) {
		
		String str = "Geeks for geeks";
		makeCapital(str);

	}
	
	public static void capitalizeCharcter(String str)
	{
		String[] words = str.split(" ");
		
		for(String w : words)
		{
			
		}
	}
	
	public static void makeCapital(String str)
	{
		
		Character.toUpperCase(str.charAt(0));
		String s = "Abcfg";
		
		System.out.println(Character.isLetter(s.charAt(0)));
		System.out.println(Character.isTitleCase(s.charAt(0)));
	}

}
