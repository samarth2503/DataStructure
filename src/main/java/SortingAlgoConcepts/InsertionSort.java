package SortingAlgoConcepts;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int nums[] = {5,67,-33,-4,0};
		
		System.out.println("Insertion Sorting "+Arrays.toString(insertionSorting(nums)));

	}
	
	public static int[] insertionSorting(int[] nums)
	{
		for(int i=0;i<=nums.length-2;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(nums[j-1]>nums[j])
				{
					int temp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		return nums;
	}

}
