package LeetcodeProblems;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinArray {

	public static void main(String[] args) {
		
		String[] batsmen = {"Rohit", "Virat","Dhawan","Iyer","Dhoni"};
		String[] bowler = {"Bhuvi", "Ishant","Jadeja","Ashwin","Kuldeep"};
		
		Stream<String> sBat = Arrays.stream(batsmen);
		Stream<String> sBowl = Arrays.stream(bowler);
		
		String[] fullTeam = Stream.concat(sBat, sBowl).toArray(size -> new String[size]);
		
		for(String s :fullTeam)
		{
			System.out.println(s);
		}
		
		// for Primitive type Arrays
		
		int[] p1 = {1,2,3,4,5};
		int[] p2 = {6,7,8,9,10};
		
		

	}

}
