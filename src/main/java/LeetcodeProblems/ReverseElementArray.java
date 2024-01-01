package LeetcodeProblems;

import java.util.Arrays;

public class ReverseElementArray {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50};
		reverseArray(a);

	}
	
	public static void reverseArray(int[] a)
	{
		int start = 0;
		int end = a.length -1;
		
		while(start<end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			
			start++;
			end--;
		}
		
		System.out.println(Arrays.toString(a));
	}

}
