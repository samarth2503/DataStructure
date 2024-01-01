package LeetcodeProblems;

public class CharcterOccurence {

	public static void main(String[] args) {
		
		System.out.println(getCharCount("Coging",'g'));
		
		System.out.println(getCharCount1("Samarth",'m'));
		
		// Using Stream
		
		String str = "Testing solutions";
		
		long cnt = str.chars().filter(e -> (char)e == 's' || (char)e == 'i').count();
		System.out.println(cnt);
	}
	
	
	// Alterway 1
	public static int getCharCount(String str, char val)
	{
		int count = 0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == val)
			{
				count++;
			}
		}
		
		return count;
	}
	
	// Alterway 1
	public static int getCharCount1(String str, char val)
	{
		int count = 0;
		char[] ch = str.toCharArray();

		for (char c : ch) {
			
			if(c==val)
			{
				count++;
			}
		}

		return count;
	}
	
	// USing stream
	


}
