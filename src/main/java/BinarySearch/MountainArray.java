package BinarySearch;

public class MountainArray {

	public static void main(String[] args) {
		
		int[] nums = {5,1,3};
		int last;
        int peak = findPeak(nums);
        int len = nums.length-1;
        
        int first = binarySerach(0,peak,nums,5);
        
        if(first==-1)
        {
            last = binarySerach(peak+1,len,nums,5);
            System.out.println(last);
        }
        else{
            System.out.println(first);
        }

	}
	
	public static int binarySerach(int low,int high,int[] nums,int target)
    {
        int start = low;
        int end = high;
        int mid = 0;
        
        while(start<=end)
        {
            mid = start + (end-start)/2;
            
            if(nums[mid]==target)
            {
                return mid;
            }
            
            if(nums[mid]>target)
            {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            
        }
        
        return -1;
    }
    
	
	
	public static int findPeak(int nums[])
    {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        
        while(start<end)
        {
            mid = start + (end-start)/2;
            
            if(nums[mid]>nums[mid-1])
            {
                end=mid;
            }
            
            if(nums[mid]<nums[mid-1])
            {
                start = mid+1;
            }
            
        }   
        return start;
    }

}
