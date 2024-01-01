package SelectionSort;

/* Put index element to correct index in LHS */

import java.util.Arrays;

public class SelectionSorting {

	public static void main(String[] args) {
		
		int nums[] = {78,0,-33,-2,1,67};
		
		System.out.println("Arrays is "+Arrays.toString(selection(nums)));

	}
	
	public static int[] selection(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			int last = nums.length-i-1;
			int max = getMaxIndex(nums,0,last);
			swap(nums,max,last);
		}
		
		return nums;
	}
	
	public static int getMaxIndex(int[] nums,int first,int last)
	{
		int max = first;
		
		for(int i=first;i<=last;i++)
		{
			if(nums[i]>nums[max])
			{
				max = i;
			}
		}
		return max;
	}
	
	public static void swap(int[] nums, int first, int second)
	{
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
	}
	
	

}
