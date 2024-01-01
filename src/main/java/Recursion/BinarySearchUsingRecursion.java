package Recursion;

public class BinarySearchUsingRecursion {

	public static void main(String[] args) {
		
		int[] nums = {33,56,78,90,94,99,101,104};
		int target = 3;
		System.out.println(binarySearch(nums,0,nums.length-1,target));

	}
	
	public static int binarySearch(int[] nums, int s, int e, int target)
	{
		int m = 0;
		
		if(s>e)
		{
			return -1;
		}
		
		
		if(s<e)
		{
			m = s+(e-s)/2;
		}
		
		if(nums[m]==target)
		{
			return m;
		}
		
		if(nums[m]>target)
		{
			return binarySearch(nums,s,m-1,target);
		}
		
		return binarySearch(nums,m+1,e,target);
	}

}
