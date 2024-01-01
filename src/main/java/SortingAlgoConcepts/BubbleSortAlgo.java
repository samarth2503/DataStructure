package SortingAlgoConcepts;

import java.util.Arrays;

public class BubbleSortAlgo {
	
	public static void main(String[] args)
	{
		int[] nums = {5,4,3,2,1};
		boolean swapped;
		for(int i=0;i<nums.length-1;i++) 
		{
			swapped=false;
			for(int j=0;j<(nums.length-i-1);j++)
			{
				if(nums[j]>nums[j+1])
				{
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					swapped=true;
				}
			}
			
			if(!swapped)
			{
				break;
			}
		}
		
		System.out.println("Array is "+Arrays.toString(nums));
	}

}
