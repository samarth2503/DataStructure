package LeetcodeProblems;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AveragArrays {

	public static void main(String[] args) {
		
		int nums[] = {4,2,34,7,9,7};
		int total = 0;
		for(int n : nums)
		{
			total = total + n;
		}
		
		System.out.println("Average is "+ (total/nums.length));
		
		OptionalDouble db = Arrays.stream(nums).average();
		System.out.println(db.getAsDouble());

	}

}
