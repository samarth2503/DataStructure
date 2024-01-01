package LeetcodeProblems;

public class PallindromChecker {

	public static void main(String[] args) {
		
		System.out.println(pallindromechecker("Nayan"));

	}
	
	public static boolean pallindromechecker(String num)
	{
		int low = 0;
		int high = num.length()-1;
		num = num.toLowerCase();
		
		while(low<high)
		{
			if(num.charAt(low)!=num.charAt(high))
			{
				return false;
			}
			 low++;
			 high--;
		}
		return true;
	}

}
