package LeetcodeProblems;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramString {

	public static void main(String[] args) {
		
		String[] str = {"Samarth","Jain"};
		
		Arrays.sort(str, Comparator.reverseOrder());
		
		for(String s : str)
		{
			System.out.println(s);
		}
		
		System.out.println(isAnagram("apple","pplea"));
	}
	
	public static boolean isAnagram(String str1, String str2)
	{
		int [] letterCount = new int[126];
		
		for(char ch : str1.toCharArray())
		{
			letterCount[ch]++;
		}
		
		for(char ch : str2.toCharArray())
		{
			letterCount[ch]--;
		}
		
		for(int count : letterCount)
		{
			if(count != 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void isAnagram2(String str1, String str2)
	{
		char[] input1 = str1.toCharArray();
		Arrays.sort(input1);
		
		char[] input2 = str2.toCharArray();
		Arrays.sort(input2);
		
		System.out.println(Arrays.equals(input1, input2));
	}
	

}
