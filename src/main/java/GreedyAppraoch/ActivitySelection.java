package GreedyAppraoch;

import java.util.Arrays;
import java.util.Scanner;

public class ActivitySelection {
	
	public static void main(String[] args)
	{
//		int[] start = {0,3,1,5,5,8};
//		int[] finish = {6,4,2,9,7,9};
//		solution(start,finish);
//		
//		int[] deadlines = {2,2,1,1,3};
//		int[] profits = {100,27,25,19,15};
//		
//		jobSequencing(deadlines,profits);
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n>0)
        {
            int range = s.nextInt();
            int result=0;
            int count =1;
            while(count<=range)
            {
                result++;
                count=count*3;
            }
            System.out.println(result);
            n--;
            
        }
	}
	
	public static void solution(int[] start,int[] finish)
	{
		Arrays.sort(finish);
		int i=0;
		System.out.println(i+" ");
		int count=0;
		for(int j=1;j<start.length;j++)
		{
			if(start[j]>=finish[i])
			{
				System.out.println(j+" ");
				i=j;
			}
			
		}
	}

}
