package LeetcodeProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringcontainsDigit {

	public static void main(String[] args) {
		
		String str = "2020";
		System.out.println(usingTravesal(str));
		System.out.println(usingCharacter(str));
		System.out.println(usingRegex(str));

	}
	
	public static boolean usingTravesal(String str)
	{
		char ch[] = str.toCharArray();
		
		for(char c : ch)
		{
			if(c < '0' || c > '9')
				return false;
		}
		
		return true;
	}
	
	public static boolean usingCharacter(String str)
	{
		char ch[] = str.toCharArray();
		
		for(char c : ch)
		{
			if(! Character.isDigit(c))
				return false;
		}
		
		return true;
	}
	
	public static boolean usingRegex(String str)
	{
		String reg = "[0-9]+";
		
		if(str == null)
		{
			return false;
		}
		
		if(str.isEmpty())
		{
			return false;
		}
		
		Pattern pt = Pattern.compile(reg);
		Matcher m = pt.matcher(str);
		
		return m.matches();
	}
	

}
