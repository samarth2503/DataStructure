package LeetcodeProblems;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int[] arr = {4,7,8,2,4,6,7};
		int[] arr1 = {67,89,34,8,0};
		
		System.out.println(Arrays.toString(arr));
		
		int res = Arrays.compare(arr, arr1);
		System.out.println(res);
		
		int[] arr2 = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOfRange(arr, 2, 6);
		System.out.println(Arrays.toString(arr3));
		
		Arrays.fill(arr3, 9);
		System.out.println(Arrays.toString(arr3));
		
		System.out.println(Arrays.equals(arr, 0, 2, arr1, 0, 2));
	

	}

}
