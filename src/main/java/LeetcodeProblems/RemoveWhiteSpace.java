package LeetcodeProblems;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String str = "    Geeks for geeks     ";
		
		String s = str.replaceAll("\\s", "");
		System.out.println(s);
		usingCharacter(str);
		isSubstring("for","geeksforgeeks");
		removeWhiteSpace(str);
	}
	
	public static void usingCharacter(String str)
	{
		String st = "";
		for(char s : str.toCharArray())
		{
			if(!Character.isWhitespace(s))
			{
				st+= Character.toString(s);
			}
		}
		
		System.out.println(st);
	}
	
	public static void removeWhiteSpace(String str)
	{
		String whitespce = "";
		for(char c : str.toCharArray())
		{
			if(c != ' ' && c != '\t')
			{
				whitespce+= String.valueOf(c);
			}
		}
		
		System.out.println("Without White space " +whitespce);
	}
	
	static int isSubstring(String s1, String s2)
    {
        int M = s1.length();
        int N = s2.length();

        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) {
            int j;

            /* For current index i, check for
            pattern match */
            for (j = 0; j < M; j++)
                if (s2.charAt(i + j) != s1.charAt(j))
                    break;

            if (j == M)
                return i;
        }

        return -1;
    }

}
