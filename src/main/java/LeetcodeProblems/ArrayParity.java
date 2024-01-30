package LeetcodeProblems;

import java.util.Arrays;

public class ArrayParity {
	
	public static void main(String[] args)
	{
		int[] a = {11,13,44,9,67,89,34,21,23};
		Parity(a);
		int[] a1 = {4,2,5,7};
		ParityII(a1);
	}
	
	public static void Parity(int[] a)
	{
		int start = 0;
		int end = a.length - 1;
		
		while(start<end)
		{
			if(a[start]%2 == 0 && a[end]%2 !=0)
			{
				start++;
				end--;
			}
			else if(a[start]% 2 !=0 && a[end]%2 ==0)
			{
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
			else if(a[end]%2 !=0)
			{
				end --;
			}
			else {
				start++;
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	public static void ParityII(int[] a)
	{
		int start = 0;
		int end = a.length - 1;
		
		while(start<end)
		{
			if(start%2 == 0 && end%2 != 0)
			{
				start++;
				end--;
			}
			else if(start% 2 !=0 && end%2 ==0)
			{
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
			else if(end%2 !=0)
			{
				end --;
			}
			else {
				start++;
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	

}
