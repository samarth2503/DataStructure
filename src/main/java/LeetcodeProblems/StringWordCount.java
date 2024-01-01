package LeetcodeProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWordCount {

	public static void main(String[] args) {

		String str = "My Name Is Samarth";
		
		char[] ch = str.toCharArray();
		int count = 0;
		for(char c : ch)
		{
//			if(c >= 'A' && c <= 'Z')
//			{
//				count++;
//			}
			
			if(Character.isUpperCase(c))
			{
				count++;
			}
			
			if(Character.isTitleCase(c))
			{
				System.out.println("Title Cae...");
			}
		}
		
		System.out.println(count);
		
		// USing stream
		
		long i = str.chars().filter(e -> Character.isUpperCase(e)).count();
		System.out.println(i);
		
		long i1 = str.chars().filter(e -> e>=65 && e<=90).count();
		System.out.println(i1);
		
		// Regular Expression
		
		String reg = "[A-Z]+";
		Pattern pt = Pattern.compile(reg);
		Matcher match = pt.matcher(str);
		int count6 = 0;
		
		while(match.find())
		{
			count6+= match.group(0).length();
		}
		
		System.out.println(count6);

	}

}
