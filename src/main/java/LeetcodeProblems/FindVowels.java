package LeetcodeProblems;

import java.util.function.IntPredicate;

public class FindVowels {

	public static void main(String[] args) {
		
		String str = "Samarth";
		int count = 0;
		
		for(int i=0;i<str.length();i++)
		{
			if(isVowel(str.charAt(i)))
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		IntPredicate vowel = new IntPredicate() {

			@Override
			public boolean test(int i) {
				// TODO Auto-generated method stub
				return i=='a' || i=='e' || i=='i' || i=='o' || i=='u' ||
						i=='A' || i=='E' || i=='I' || i=='O' || i=='U';
			}
			
		};
		
		long cnt = str.chars().filter(vowel).count();
		System.out.println(cnt);

	}
	
	public static boolean isVowel(char i)
	{
		return i=='a' || i=='e' || i=='i' || i=='o' || i=='u' ||
				i=='A' || i=='E' || i=='I' || i=='O' || i=='U';
	}

}
