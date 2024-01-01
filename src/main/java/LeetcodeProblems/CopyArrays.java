package LeetcodeProblems;

import java.util.Arrays;

public class CopyArrays {

	public static void main(String[] args) {
		
		int[] a = {1,7,9};
		
		int[] b = new int[a.length];
		
		// 1. Using Array refernce
		b = a;
		//b[0]++;
		
		for(int a1 : a)
		{
			System.out.println(a1);
		}
		
		
		for(int b1 : b)
		{
			System.out.println(b1);
		}
		
		// 2 Using clone method
		
		int[] b2 = a.clone();
		
		// 3 Use copyOfRange()
		int[] a1 = {1,7,9};
		
		int[] b1 = new int[a1.length];
		b1 = Arrays.copyOfRange(a1, 0, (a1.length-1));
		
		for(int i : b1)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i : a1)
		{
			System.out.print(i+" ");
		}

	}

}
