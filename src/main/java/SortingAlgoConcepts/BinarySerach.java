package SortingAlgoConcepts;

import java.util.Arrays;

public class BinarySerach {

	public static void main(String[] args) {
	
		int[] a = new int[] {2,3,4,7,8,9,10,17,19,20};
		int x = 2;
		int high = a.length;
		int result=binarySerach(a,x,0,high-1);
		System.out.println(result);
	}
	
	public static int binarySerach(int[] arr,int x ,int low,int high)
	{
		while(low<=high)
		{
			int mid = low + (high-low)/2;
			
			if(arr[mid]==x)
			{
				return mid;
			}
			
			if(arr[mid]>x)
			{
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		
		return -1;
	}

}
