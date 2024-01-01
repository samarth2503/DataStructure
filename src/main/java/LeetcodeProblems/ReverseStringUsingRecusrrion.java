package LeetcodeProblems;

import java.util.Stack;

public class ReverseStringUsingRecusrrion {

	public static void main(String[] args) {
		
		System.out.println(reverseString("Samarth"));
		System.out.println(isPrime(12));
		
		reverseOrderWords("My Name is Samarth");
		reverseWordInString("This is sample");
		reverseUsingStack("Sample");
		reverseUsingSwapping("My name is samarth");
	}
	
	public static String reverseString(String input)
	{
		if(input.isEmpty())
		{
			return input;
		}
		
		return reverseString(input.substring(1))+ input.charAt(0);
	}
	
	public static boolean isPrime(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num% i == 0)
			{
				return false;
			}
			
		}
		
		return true;
	}
	
	public static void reverseOrderWords(String str)
	{
		String[] st = str.split(" ");
		String op = "";
		for(int i=(st.length-1);i>=0;i--)
		{
			op = op.concat(st[i]).concat(" ");
		}
		
		System.out.println(op);
	}
	
	public static void reverseWordInString(String str)
	{
		StringBuilder strb = new StringBuilder();
		
		String [] st = str.split(" ");
		
		for(String word : st)
		{
			String string = new StringBuilder(word).reverse().toString();
			strb.append(string).append(" ");
		}
		
		System.out.println(strb);
	}
	
	public static void reverseUsingStack(String str)
	{
		Stack<Character> c = new Stack<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			c.push(str.charAt(i));
		}
		
		String temp = "";
		
		while(!c.isEmpty())
		{
			temp = temp + c.pop();
		}
		
		System.out.println(temp);
	}
	
	public static void reverseUsingSwapping(String str)
	{
		char ch[] = str.toCharArray();
		int left = 0;
		int right = str.length() - 1;
		
		for(left =0;left<right;left++, right --)
		{
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
		}
		
		for(char c : ch)
		{
			System.out.print(c);
		}
		
		
	}

}
