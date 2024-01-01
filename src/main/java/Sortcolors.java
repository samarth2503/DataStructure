import java.util.Arrays;

public class Sortcolors {

	public static void main(String[] args) {
		
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void sortColors(int[] nums) {
        
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                count1++;
            }
            else if(nums[i]==1)
            {
                count2++;
            }
            else
            {
                count3++;
            }
        }
        
        if(count1>0)
        {
            nums = fillArray(nums,0,count1,0);
        }
        if(count2>0)
        {
            nums = fillArray(nums,count1,count1+count2,1);
        }
        if (count3>0){
            nums = fillArray(nums,count1+count2,nums.length,2);
        }
     
        
        
    }
    
    public static int[] fillArray(int[] nums,int start,int end,int value)
    {
        for(int i=start;i<end;i++)
        {
            nums[i] = value;
        }
        
        return nums;
    }

}
