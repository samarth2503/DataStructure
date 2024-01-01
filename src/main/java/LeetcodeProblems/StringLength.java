package LeetcodeProblems;

public class StringLength {

	public static void main(String[] args) {
		
		String str = "testing";
		
		System.out.println(str.toCharArray().length);
		
		System.out.println(str.lastIndexOf(""));
		
		System.out.println(str.split("").length);
		
		int count = 0;
		for(char c : str.toCharArray())
		{
			count++;
		}
		System.out.println(count);
		
		int l1=0;
		try {
			l1 = str.getBytes("UTF-16BE").length/2;
		}
		catch(Exception e)
		{
			
		}
		
		System.out.println(l1);

	}
	
	public static int getLength(String str)
	{
		int count = 0;
		
	
		try {
			while(true)
			{
				str.charAt(count);
				count++;
			}
		}
		catch(IndexOutOfBoundsException e)
		{
			return count;
		}
				
		
		
	}

}
