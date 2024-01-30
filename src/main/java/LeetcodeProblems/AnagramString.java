package LeetcodeProblems;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramString {

	public static void main(String[] args) {
		
//		String[] str = {"Samarth","Jain"};
//		
//		Arrays.sort(str, Comparator.reverseOrder());
//		
//		for(String s : str)
//		{
//			System.out.println(s);
//		}
		
		System.out.println(isAnagram("apple","pplea"));
	}
	
	public static boolean isAnagram(String str1, String str2)
	{
		int[] res = new int[26];
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		for(char c : str1.toCharArray())
		{
			res[c - 'a']++;
		}
		
		for(char c1 : str2.toCharArray())
		{
			res[c1 - 'a']--;
		}
		
		for(int r : res)
		{
			if(r != 0)
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
