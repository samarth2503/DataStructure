package SortingAlgoConcepts;

import java.util.Arrays;

public class FirstandLastPositionArray {

	public static void main(String[] args) {
		
		int[] nums = {5,7,7,8,8,10};
		int target = 6;
		System.out.println(Arrays.toString(result(nums,target)));
		
	}
	
	public static int[] result(int[] nums,int target)
	{
		int[] op = new int[2];
        
        op[0] = findIndex(nums,target,true);
        op[1] = findIndex(nums,target,false);
        
        if(nums[op[0]]==target && nums[op[1]]==target)
        {
        	return op;
            //System.out.println("Start Index is "+op[0]+" and Last Index is "+op[1]);
        }
        else{
            op[0]=-1;
            op[1]=-1;
            return op;
            //System.out.println("Start Index is "+op[0]+" and Last Index is "+op[1]);
        }
	}
	
	public static int findIndex(int[] nums,int target,boolean flag)
    {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        if(flag==true)
        {
            while(start<=end)
            {
                mid=start + (end-start)/2;
                
                // if(nums[mid]==target)
                // {
                //     return mid;
                // }
                
                if(nums[mid]>=target)
                {
                    end = mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            return start;
        }
        else
        {
            while(start<=end)
            {
                mid=start + (end-start)/2;
                
                // if(nums[mid]==target)
                // {
                //     return mid;
                // }
                
                if(nums[mid]>target)
                {
                    end = mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            return end;
        }
    }

}
