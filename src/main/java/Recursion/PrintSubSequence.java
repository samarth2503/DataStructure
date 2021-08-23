package Recursion;

public class PrintSubSequence {

	public static void main(String[] args) {
		
		String input = "xyz";
		subsequence(input);
	}
	
	public static void subsequence(String input)
	{
		subsequence(input,"");
	}
	
	public static void subsequence(String input,String outputSoFar)
	{
		if(input.length()==0)
		{
			System.out.println(outputSoFar);
			return;
		}
		
		subsequence(input.substring(1),outputSoFar);
		
		subsequence(input.substring(1),outputSoFar+input.charAt(0));
	}


}
