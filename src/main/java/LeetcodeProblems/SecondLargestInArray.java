package LeetcodeProblems;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		
		int[] a = {6,8,2,4,3,1,5,7};
		int k = 2;
		findSecondLargest(a,(k-1));

	}
	
	public static void findSecondLargest(int[] a, int k)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=(i+1);j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
			if(i==k)
			{
				System.out.println(a[i]);
				break;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
