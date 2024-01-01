package SortingAlgoConcepts;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		
		int[] nums1 = {0};
		int m = 0;
		int[] nums2 = {1};
		int n = 1;
		
		merge(nums1,m,nums2,n);
		
		System.out.println(Arrays.toString(nums1));

	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
		if(m==0)
        {
            nums1 = nums2.clone();
            return;
        }
        
        if(n==0)
        {
            //nums2 = nums1;
            return;
        }
        
        int i = 0;
        int j = 0;
        
        while(i<=(m-1) && j<=(n-1))
        {
            if(nums1[i]>=nums2[j])
            {
                swap(nums1,i,m+1);
                
                nums1[i] = nums2[j]; 
                
                i++;
                j++;
            }
            
            else if(nums1[i]<nums2[j])
            {
            	i++;
            }
            else {
            	j++;
            }
        }
        
        while(i<m)
        {
        	m = m+1;
            nums1[m] = nums2[j];
            i++;
        }
        
        while(j<n)
        {
        	m = m+1;
            nums1[m] = nums2[j];
            j++;
        }
        
    }
    
    public static void swap(int[] nums1,int start,int end)
    {
        for(int i=end;i>start;i--)
        {
            int temp = nums1[i-1];
            nums1[i-1] = nums1[i];
            nums1[i] = temp;
        }
    }

}
