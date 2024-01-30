package LeetcodeProblems;

import java.util.Arrays;

public class SortelementInarray {

	public static void main(String[] args) {
		
		int[] a = {-5,-9,8,12,1,3};
		ascendingSorting(a);
		descendingSorting(a);

	}
	
	public static void ascendingSorting(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] =a[j];
					a[j] =temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void descendingSorting(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp = a[i];
					a[i] =a[j];
					a[j] =temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
