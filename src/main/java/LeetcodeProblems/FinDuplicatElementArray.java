package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinDuplicatElementArray {

	public static void main(String[] args) {
		
		int[] a = {1,2,4,3,2};
		
		System.out.println(finDuplicateUsingLoop(a));
		
		System.out.println(findDuplicateUsingSingleWithExtraSpace(a));
		
		System.out.println(findDuplicateUsing(a));
		
		System.out.println(findDuplicateUnSortedArray(new int[] {4,3,2,7,8,2,3,1}));
		
	}
	
	/*
	 * Time Complixity :- O(n2)
	 * Spce complexity : O(1)
	 */
	public static int finDuplicateUsingLoop(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					return a[i];
				}
			}
		}
		
		return -1;
	}
	
	/*
	 * Time Complixity :- O(nlogn)
	 * Spce complexity : O(1)
	 * 
	 */
	public static int findDuplicateUsingSingleWithExtraSpace(int[] a)
	{
		Arrays.sort(a);
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				return a[i];
			}
		}
		
		return -1;
	}
	
	/*
	 * Time Complixity :- O(n)
	 * Spce complexity : O(1)
	 * int[] a = {1,2,4,3,2};
	 */
	public static int findDuplicateUsing(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int index = Math.abs(a[i]);
			
			if(a[index]<1)
			{
				return index;
			}
			else {
				a[index] = - a[index];
			}
		}
		
		return -1;
	}
	
	public static List<Integer> findDuplicateUnSortedArray(int[] a)
	{
		List<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			int index = Math.abs(a[i])-1;
			
			if(a[index] < 1)
			{
				al.add(index+1);
			}
			else {
				
				a[index] = -a[index];
			}
		}
		
		return al;
	}

}
