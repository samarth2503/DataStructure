package LeetcodeProblems;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {

		Random rand = new Random();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("Random int "+ rand.nextInt());
			System.out.println("Random float "+ rand.nextFloat());
			System.out.println("Random double "+ rand.nextDouble());
			System.out.println("Random boolean "+ rand.nextBoolean());
		}
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(Math.random());
		}
		
		System.out.println(rand.nextInt(20));				// Generate random number between 0 to 20

	}

}
