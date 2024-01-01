package LeetcodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows :");
		int rows = sc.nextInt();
		
		System.out.println("Enter Cols :");
		int cols = sc.nextInt();
		
		int matrix[][] = new int[rows][cols];
		System.out.println("Enter matric data ...2");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix[i][i] = sc.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		// To print 2d arrays
		System.out.println(Arrays.deepToString(matrix));

	}

}
