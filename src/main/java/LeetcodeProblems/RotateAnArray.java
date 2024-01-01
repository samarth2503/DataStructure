package LeetcodeProblems;

import java.util.Arrays;

public class RotateAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		
		System.out.println(Arrays.toString(rotateArray(arr,k)));
		
		for(int i=0;i<=k;i++)
		{
			rotateArray2(arr);
		}
		
		System.out.println(Arrays.toString(arr));

	}
	
	public static int[] rotateArray(int[] arr, int k)
	{
		int n = arr.length;
		int res [] = new int[arr.length];
		int count = 0;
		for(int i=k+1;i<n;i++)
		{
			res[count] = arr[i];
			count++;
		}
		
		for(int j=0;j<=k;j++)
		{
			res[count] = arr[j];
			count++;
		}
		
		return res;
	}
	
	public static void rotateArray2(int[] arr)
	{
		int n = arr.length - 1;
		int start = arr[0];
		
		for(int j=0;j<n;j++)
		{
			arr[j] = arr[j+1]; 
		}
		
		arr[n] = start;
	} 

}
