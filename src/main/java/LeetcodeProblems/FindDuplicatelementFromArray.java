package LeetcodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatelementFromArray {

	public static void main(String[] args) {
		
		String infra[] = {"Amazon","GCP","Azure","Amazon","Ali Baba","SauceLabs","Azure","GCP"};
		
		
		
		System.out.println("*******************Brute Force******************************");
		for(int i=0;i<infra.length;i++)
		{
			for(int j=i+1;j<infra.length;j++)
			{
				if(infra[i].equals(infra[j]))
				{
					System.out.println(infra[i]);
				}
			}
		}
		
		System.out.println("******************Using HashSet*************************");
		Set<String> hs = new HashSet<String>();
		
		for(String e:infra)
		{
			if(!hs.contains(e))
			{
				hs.add(e);
			}
			else {
				System.out.println(e);
			}
		}
		
		System.out.println("****************Using HashMap********************** ");
		
		Map<String,Integer> hm = new HashMap<String,Integer>();
		
		for(int i=0;i<infra.length;i++)
		{
			Integer count = hm.get(infra[i]);
			if(count == null)
			{
				hm.put(infra[i], 1);
			}
			else {
				hm.put(infra[i], hm.get(infra[i])+1);
			}
		}
		
		for(Entry<String, Integer> h : hm.entrySet())
		{
			if(h.getValue()>=2)
			{
				System.out.println(h.getKey());
			}
		}
		
		System.out.println("**********************With Streams **************************");
		
		Set<String> h = new HashSet<String>();
		
		Set<String> s = Arrays.asList(infra).stream().filter(e -> !h.add(e)).collect(Collectors.toSet());
		
		System.out.println(s);

	}

}
