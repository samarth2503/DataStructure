package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		
		int[] arr = {-1,0,1,2,-1,-4};
		
		System.out.println(AddThreeSum(arr));
		
	}
	
	public static List<List<Integer>> AddThreeSum(int arr[])
	{
		List<List<Integer>> al = new ArrayList<List<Integer>>();
		
		if(arr == null && arr.length<3)
		{
			return al;
		}
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-2;i++)
		{
			int left = i+1;
			int right = arr.length -1;
			
			while(left<right)
			{
				int sum = arr[i] + arr[left] + arr[right];
				
				if(sum==0)
				{
					
					al.add(Arrays.asList(arr[i],arr[left],arr[right]));
					left++;
					right--;
					
				}
				else if(sum < 0)
				{
					left++;
				}
				else {
					right--;
				}
			}
		}
		
		return al;
	}
	
	

}
