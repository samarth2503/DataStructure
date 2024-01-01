package Mathdsa;

public class SetMismatch {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,4,6};
		//System.out.println(setMismatch(nums));
		
		System.out.println(hasAlternatingBits(5));
	}
	
	public static int setMismatch(int[] nums)
	{
		int ans = 0;
		int j = 0;
		for(int i=0;i<nums.length;i++)
		{
			
			j^=nums[i];
			
			if(j%4==nums[i])
			{
				ans=nums[i];
				continue;
			}
			
			if(j%4==1)
			{
				continue;
			}
			
			if(j%4==nums[i]+1)
			{
				continue;
			}
			
			if(j%4==0)
			{
				continue;
			}
			
			ans = nums[i];
			
		}
		
		return ans;
	}
	
	public static boolean hasAlternatingBits(int n) {
        
		
		int last= n%2;
        n=n>>1;
        while(n>0){
             int curr= n%2;
            if(curr==last){
                return false;
            }
            last= curr;
            n=n>>1;
        }
        return true;
    }
	
	public static int findBit(int n)
    {
        return Integer.toBinaryString(n).length();
    }

}
