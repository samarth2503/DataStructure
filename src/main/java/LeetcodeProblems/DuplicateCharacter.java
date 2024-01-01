package LeetcodeProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
		String s = "Jelly";
		printDuplicateCharacter(s);
		printDuplicateCharacter(null);

	}
	
	public static void printDuplicateCharacter(String str)
	{
		if(str == null)
		{
			System.out.println("Null String..");
			return;
		}
		 if(str.isEmpty())
		 {
			 System.out.println("Empty String...");
			 return;
		 }
		 if(str.length() == 1)
		 {
			 return;
		 }
		 
		 char[] ch = str.toCharArray();
		 
		 Map<Character, Integer> hm = new HashMap<Character,Integer>();
		 
		 for(Character c : ch)
		 {
			 if(hm.containsKey(c))
			 {
				 hm.put(c,hm.get(c)+1);
			 }
			 else {
				 hm.put(c, 1);
			 }
		 }
		 
		 for(Entry<Character, Integer> h : hm.entrySet())
			{
				if(h.getValue()>1)
				{
					System.out.println(h.getKey()+" : "+h.getValue());
				}
			}
	}

}
