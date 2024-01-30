package LeetcodeProblems;

import java.util.Arrays;

public class DuplicateelementInArray {

	public static void main(String[] args) {
		
		int[] arrayWithDuplicates = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9, 4,2,0,11};
		
		removeDuplicatesWithoutsorting(arrayWithDuplicates);
		removeDuplicateWithSorting(arrayWithDuplicates);
		
//		int[] a = {6,8,4,7,5,4};
//		int[] b = new int [a.length];
//		b[0] = a[0];
//		int count = 0;
//		
//		for(int i=1;i<a.length;i++)
//		{
//			if(a[i]!=b[count])
//			{
//				count = count+1;
//				b[count] = a[i];
//			}
//		}
//		
//		System.out.println(Arrays.toString(b));

	}
	
	public static void removeDuplicatesWithoutsorting(int[] arr)
	{
		int[] newArr = new int[arr.length];
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			boolean isDisplayed = false;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					isDisplayed=true;
					break;
				}
			}
			
			if(!isDisplayed)
			{
				newArr[count] = arr[i];
				count++;
			}
		}
		
		newArr = Arrays.copyOfRange(newArr, 0, count);
		System.out.println(Arrays.toString(newArr));
	}
	
	public static void removeDuplicateWithSorting(int[] arr)
	{
		Arrays.sort(arr);
		int[] newArr = new int[arr.length];
		newArr[0] = arr[0];
		int count = 0;
		
		for(int i=1;i<arr.length;i++)
		{
			if(newArr[count]!=arr[i])
			{
				count ++;
				newArr[count] = arr[i];
			}
		}
		
		newArr=Arrays.copyOfRange(newArr, 0, count+1);
		System.out.println(Arrays.toString(newArr));
	}

}
