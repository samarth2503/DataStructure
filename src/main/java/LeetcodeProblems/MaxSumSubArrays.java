package LeetcodeProblems;

public class MaxSumSubArrays {

	public static void main(String[] args) {

		int[] arr = {2,3,5,4,3,5,4};
		
		System.out.println(findSingle(arr));

	}
	
	public static void sumSubArrys(int[] a)
	{
		int wSum = 0;
		int k = 3;
		int mSum = Integer.MIN_VALUE;
		
		for(int i=0;i<k;i++)
		{
			wSum = wSum + a[i];
		}
		
		for(int j=k;j<a.length;j++)
		{
			wSum = wSum - a[j-k] +a[j];
			
			mSum = Math.max(mSum, wSum);
		}
		
		System.out.println(mSum);
	}
	
	public static int findSingle(int[] a)
	{
		 int res = a[0]; 
	     for (int i = 1; i < a.length; i++) 
	          res = res ^ a[i]; 
	      
	     return res; 
	}

}
