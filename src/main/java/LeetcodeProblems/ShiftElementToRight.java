package LeetcodeProblems;

import java.util.Arrays;

public class ShiftElementToRight {

	public static void main(String[] args) {

		int[] a = {1,0,2,3,0,0,0};
		//System.out.println(Arrays.toString(moveElementRight(a)));
		moveElementRight2(a);

	}
	
	public static int[] moveElementRight(int[] a)
	{
		int [] newArray = new int[a.length];
		int count = 0;
		for(int i : a)
		{
			if(i!=0)
			{
				newArray[count] = i;
				count++;
			}
		}
		
		return newArray;
	}
	
	public static void moveElementRight2(int[] a)
	{	
		int i = 0;
		int j = 0;
		
		while(j<a.length)
		{
			if(a[j]!=0)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++; j++;
			}
			else {
				j++;
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
