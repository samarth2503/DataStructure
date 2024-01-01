package LeetcodeProblems;

public class FindMaxNumber {
	
	public static void max(int a,int b,int c)
	{
		int max = 0;
		while(a>0 || b>0 || c>0)
		{
			a--;
			b--;
			c--;
			max++;
		}
		
		System.out.println(max);
		
	}
	
	public static void min(int a,int b,int c)
	{
		int min = 0;
		while(a>0 && b>0 && c>0)
		{
			a--;
			b--;
			c--;
			min++;
		}
		
		System.out.println(min);
		
	}

	public static void main(String[] args) {
		
		max(34,34,0);
		
		min(0,0,0);
		
		min(13,9,7);
	}

}
