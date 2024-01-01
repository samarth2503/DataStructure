package BinarySearch;

import java.util.Arrays;

public class MergeSortAlgo {

	public static void main(String[] args) {
		
		int[] a = {7,9,18,19,22};
		int[] b = {1,6,9,11};
		
		System.out.println(Arrays.toString(mergeSort(a,b)));
	}
	
	public static int[] mergeSort(int[] a,int[] b)
	{
		int m = a.length;
		int n = b.length;
		int i=0;
		int j=0;
		int k=0;
		int [] mergedArray = new int[m+n];
		
		while(i<m && j<n)
		{
			
			if(a[i]<b[j])
			{
				mergedArray[k]=a[i];
				i++;
				k++;
			}
			else {
				mergedArray[k]=b[j];
				j++;
				k++;
			}
			
		}
		
		while(i<m)
		{
			mergedArray[k]=a[i];
			k++;
			i++;
		}
		
		while(j<n)
		{
			mergedArray[k]=b[j];
			k++;
			j++;
		}
		
		return mergedArray;
	}

}
