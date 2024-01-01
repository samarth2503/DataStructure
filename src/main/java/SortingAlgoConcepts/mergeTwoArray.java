package SortingAlgoConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class mergeTwoArray {

	public static void main(String[] args) {
		
		//System.out.println(findDuplicate(new int[] {0,4,5,0,3,6}));
		
		int[] nums1 = {-1,0,1,2,-1,-4};
//		int k = 2;
//		System.out.println(merge(nums1,k));
		System.out.println(threeSum(nums1));
		
//		int[] nums1 = {1,2,3,0,0,0};
//		int[] nums2 = {2,5,6};
//		merge(nums1,3,nums2,3);
//		System.out.println(Arrays.toString(nums1));
		
	}
	
	public static int merge(int[] nums,int k) {
		
		
		 Set<Integer> tree = new TreeSet<Integer>();
	        
	        int j = 1;
	        
	        for(int i=0;i<nums.length;i++)
	        {
	            tree.add(nums[i]);
	        }
	        List<Integer> l1 = new ArrayList<Integer>(tree);
	        
	        ListIterator<Integer> ls
	            = l1.listIterator();
	        
	        int s = l1.size()-k;
	        while(ls.hasNext())
	        {
	            if(j==s)
	            {
	                return ls.next();
	            }
	            j++;
	        }
	            
	        return -1;
	     }
    
	
	public static boolean findDuplicate(int[] nums)
	{
		 int count = 1;
	        int count1 = 0;
	        int ansIndex = 0;
	        int ans = 0;
	        for(int i=1;i<nums.length;i++)
	        {
	            if(nums[i]==nums[ansIndex])
	            {
	                count++;
	            }
	            else
	            {
	                count--;   
	            }
	            
	            if(count==0)
	            {
	                ansIndex = i;
	                count=1;
	            }
	        }
	        
	        ans = nums[ansIndex];
	        
	        for(int j=0;j<nums.length;j++)
	        {
	            if(ans==nums[j])
	            {
	                count1++;
	            }
	        }
	        
	        return (count1>=2)?true:false;
	}
	
	@SuppressWarnings("removal")
	public static List<List<Integer>> threeSum(int[] nums) {
        
        
        List<Integer> subList1 = new ArrayList<Integer>();
        List<List<Integer>> superList1 = new ArrayList<List<Integer>>();
        Map<List<Integer>,Integer> hm = new HashMap<List<Integer>,Integer>();
        
        int sum = 0;
        
        if(nums.length<3)
        {
            return superList1;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    sum+=nums[i]+nums[j]+nums[k];
                    
                    if(sum==0)
                    {
                    	List<Integer> al = new ArrayList<Integer>();
                        al.add(0,nums[i]);
                        al.add(1,nums[j]);
                        al.add(2,nums[k]);
                        
                        Collections.sort(al);
                       
                        List<List<Integer>> superList = new ArrayList<List<Integer>>();

                        if(!hm.containsKey(superList.add(al)))
                        {
                        	hm.put(al,1);
                        	
                        }
                        else
                        {
                        	hm.put(al,hm.get(al)+1);
                        }
                       
                    }
                    sum=0;
                }
            }
        }
        
//        System.out.println(hm);
        
        for (Map.Entry<List<Integer>,Integer> entry : hm.entrySet())
        {
            superList1.add(entry.getKey());
        }

        
        return superList1;
    }
}
