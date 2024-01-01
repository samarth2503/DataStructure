package LeetcodeProblems;

public class NumIdenticalPairs {

	public static void main(String[] args) {
		
		int [] nums = {1,2,3,1,1,3};
		int op = identicalPairs(nums);
		System.out.println(op);
	}
	
	public static int identicalPairs(int[] nums)
	{
		int bucket [] = new int[101];
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            bucket[nums[i]] += 1;
        }

        for(int j=0;j<bucket.length;j++)
        {
            if(bucket[j]>=2)
            {
            	int a = bucket[j];
            	int b = bucket[j] - 1;
            	count += (a * (b))/2;
            }
        }

        return count;
        
		
	}

}
