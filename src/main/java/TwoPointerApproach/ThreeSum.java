package TwoPointerApproach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] nums = {-1,0,1,2,-1,4};
//		System.out.println(threeSum(nums));
		
		int[] nums1 = {-1,0,-5,-2,-2,-4,0,1,-2};
		System.out.println(fourSum(nums1,-9));

	}

	public static List<List<Integer>> threeSum(int[] nums) {
		
		Arrays.sort(nums);
		List<List<Integer>> ls = new ArrayList<List<Integer>>();
		
		for(int i=0;i<nums.length-2;i++)
		{
			if(i==0 || (i>0 && nums[i]!=nums[i-1]))
			{
				int low = i+1;
				int high = nums.length-1;
				int sum = 0-nums[i];
				
				while(low<high)
				{
					if(nums[low]+nums[high]==sum)
					{
						ls.add(Arrays.asList(nums[i],nums[low],nums[high]));
						low++;
						high--;
					}
					else if(nums[low]+nums[high]>sum)
					{
						high--;
					}
					else
					{
						low++;
					}
				}
			}
		}
		return ls;
		
	}
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        
        if(nums.length<4)
        {
            return ls;
        }
        
        for(int i=0;i<nums.length-3;i++)
        {
        	if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++)
            {
            	if(j>i+1 && nums[j]==nums[j-1])
                {
                    continue;
                }
            	
                int first = nums[i];
                int second = nums[j];
                int low = j+1;
                int high = nums.length-1;
                int temp = target-first-second;
                
                while(low<high)
                {
                    if(nums[high]+nums[low]==temp)
                    {
                        //List<Integer> al = Arrays.asList(first,second,nums[low],nums[high]);
                       
//                        
                        ls.add(Arrays.asList(first,second,nums[low],nums[high]));
                       
                        
                        while(low<high && nums[low]==nums[low+1])
                        {
                            low++;
                            continue;
                        }
                        while(low<high && nums[high]==nums[high-1])
                        {
                            high--;
                            continue;
                        }
                        
                        high--;
                        low++;
                    }
                
                    else if(temp<nums[low]+nums[high])
                    {
                        high--;
                    }
                    else
                    {
                        low++;
                    }
                    
                }
            }
                
            
        }
        
        return ls;
        
    }
}
