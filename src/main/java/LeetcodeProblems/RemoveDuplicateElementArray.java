package LeetcodeProblems;

import java.util.Arrays;

public class RemoveDuplicateElementArray {

	public static void main(String[] args) {
		
		int arr[] = {2,2,3,3,4,6,6};
		int [] temp = new int[arr.length];
		
		int rd = 0;
		temp[rd] = arr[rd];
		int i=1;
		
		while(i<arr.length)
		{
			if(arr[i]==temp[rd])
			{
				i++;
			}
			else{
				rd++;
				temp[rd] = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(temp));

	}

}
