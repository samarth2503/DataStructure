package SortingAlgoConcepts;

/* Put index element to correct index in LHS */

import java.util.Arrays;

public class SelectionSorting {

	public static void main(String[] args) {
		
		int nums[] = {5,3,4,1,2};
		
		selectionSort(nums);
		
		System.out.println(Arrays.toString(nums));

	}
	
	public static void selectionSort(int[] nums)
	{
		int last = 0;
		for(int i=0;i<nums.length;i++)
		{
			last = nums.length-i-1;
			int maxIndex = getMaxIndex(nums,0,last);
			swap(nums,maxIndex,last);
		}
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
	
	public static void swap(int[] nums, int first,int second)
	{
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
		
	}

}
