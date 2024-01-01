package LeetcodeProblems;

import java.util.Arrays;

public class PeakElements {

	public static void main(String[] args) {
		
		int arr[] = {1,3,20,4,1,0};
		System.out.println(findPeakElement(arr, arr.length));
		System.out.println(Arrays.toString(reverseElement(arr)));
		
		int[] arr1 = {1,2,3,4,5,6,7};
		reArrange(arr1);
		

	}
	
	public static int findPeakElement(int[] a, int n)
	{	
		
		if(n==1)
		{
			return 0;
		}
		if(a[0] >= a[1])
		{
			return 1;
		}
		if(a[n-1] >= a[n-2])
		{
			return n-1;
		}
		
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]>a[i-1] && a[i]>a[i+1]) {
				return i;
			}
		}
		
		return 0;
	}
	
	public static int[] reverseElement(int[] arr)
	{
		int i = 0;
		int j = arr.length - 1;
		
		while(i<j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++; j--;
		}
		
		return arr;
	}
	
	public static void reArrange(int[] a)
	{
		int i = 0;
		int j = a.length - 1;
		
		while(i<j)
		{
			if(a[i]<a[j])
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
			}
			
			if(a[i]>a[j])
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j++;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	

}
