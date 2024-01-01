package LeetcodeProblems;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {
	
	public static void main(String[]args)
	{
		printNum(1);
		
		// Using Streams
		IntStream.range(1,101).forEach(e -> System.out.println(e));
	}
	
	// Using Recursive function 
	public static void printNum(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			num+=1;
			printNum(num);
		}
	}

}
