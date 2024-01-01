package SortingAlgoConcepts;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		
		int [] nums = {5,3,4,6,1,2};
		int i = 0;
		
		while(i<nums.length)
		{
			int j = nums[i] - 1;
			if((i+1)!=nums[i])
			{
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
			else 
			{
				i++;
			}
			
		}
		
		System.out.println("Array is "+Arrays.toString(nums));

	}

}
