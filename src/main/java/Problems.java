import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Problems {
	
	public static void main(String[] args)
	{
//		int[] nums = {40,11,26,27,-20};
//		System.out.println(sortingArray(nums));
		findPowerOfNumber(3,6);
//		magicNumber(3);
	}
	
	
	public static List<List<Integer>> sortingArray(int[] arr)
    {
		int min = 0;
		Set<Integer> hs = new TreeSet<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        
        List<Integer> sortList = new ArrayList<Integer>(hs);
        
        System.out.println(sortList);
        for(int j=0;j<=sortList.size()-2;j++)
        {
        	int diff = Math.abs(Math.abs(sortList.get(j+1))-Math.abs(sortList.get(j)));
        	
        	if(j==0)
        	{
        		min = diff;
//        		List<Integer> sub = new ArrayList<Integer>();
//        		List<List<Integer>> superList = new ArrayList<List<Integer>>();
//                sub.add(sortList.get(j));
//                sub.add(sortList.get(j+1));
//                superList.add(sub);
//                result.addAll(superList);
        		continue;
        	}
            
            if(diff<=min)
            {
            	//min = diff;
                List<Integer> sub = new ArrayList<Integer>();
                List<List<Integer>> superList = new ArrayList<List<Integer>>();
                sub.add(sortList.get(j));
                sub.add(sortList.get(j+1));
                superList.add(sub);
                result.addAll(superList);
            }
        }
        
        return result;
    }
	
	public static void magicNumber(int n)
	{
		int base = 5;
		int ans = 0;
		int k = base;
		while(n>0) {
			
			int last = n&1;
			
			if(last==1)
			{
				ans+= (base);
			}
			
        	base = base*5;
        	n = n>>1;
		}
		
		System.out.println("Magic Number of is "+ans);
	}
	
	public static void findPowerOfNumber(int base ,int n)
	{
		int ans = 1;
		while(n>0)
		{
			int last = n&1;
			if(last==1)
			{
				ans= ans*base;
			}
			
			n = n>>1;
			base = base*base;
		}
		
		System.out.println("Answer is "+ans);
		
		
	}

}
