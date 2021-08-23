package Kadane;

public class MaxSumsubarray {

	public static void main(String[] args) {

		int[] arr = {4,3,-2,6,7,-10,-10,4,5,9,-3,4,7,-18,2,9,3,-2,11};
		//int[] arr = {-5,4,6,-3,4,-1};
		System.out.println(sumOfSubarray(arr));
	}
	
	public static int sumOfSubarray(int[] arr)
	{
		int sum=0;
		int currMax = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				sum+=arr[j];
				currMax = Math.max(sum, currMax);
			}
			sum=0;
		}
		return currMax;
	}
	
	public static int sum(int[] arr)
	{
		int maxSum = 0;
		int currSum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			currSum += arr[i];
			
			if(currSum>maxSum)
			{
				maxSum = currSum;
			}
			
			if(maxSum>0)
			{
				currSum = 0;
			}
		}
		
		return maxSum;
	}
}
