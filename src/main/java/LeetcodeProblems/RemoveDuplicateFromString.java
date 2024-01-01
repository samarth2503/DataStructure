package LeetcodeProblems;

import java.util.Arrays;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		removedup(str);
		removedup2(str.toCharArray(),str.length());
	}
	
	public static void removedup(String str)
	{
		String s = "";
		
		for(char c : str.toCharArray())
		{
			if(!s.contains(Character.toString(c)))
			{
				s+=Character.toString(c);
			}
			
		}
		
		System.out.println(s);
	}
	
	public static String removedup2(char str[], int n)
	{
		int index = 0;
		 
        // Traverse through all characters
        for (int i = 0; i < n; i++) {
 
            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }
 
            // If not present, then add it to
            // result.
            if (j == i) {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
	}


}
