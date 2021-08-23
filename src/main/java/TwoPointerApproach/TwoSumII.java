package TwoPointerApproach;

import java.util.Arrays;

public class TwoSumII {

	public static void main(String[] args) {
		
		int[] numbers = {2,3,4};
		System.out.println(Arrays.toString(twoSum(numbers,6)));
	}
	
	public static int[] twoSum(int[] numbers,int target)
	{
		int sum=0;
        int[] res = new int[2];
        int i=0;
        int j=(numbers.length)-1;
        while(j>=1)
        {
            sum = numbers[i]+numbers[j];
            
            if(sum==target)
            {
                res[0]=i+1;
                res[1]=j+1;
                break;
            }
            else if(sum<target)
            {
                i++;
                continue;
            }
            else{
                j--;
                continue;
            }
        }
        
        return res;
        
	}

}
