import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("India","New Delhi");
		hm.put("USA","Washington DC");
		hm.put("UK","London");
		hm.put("UK","London11");
		hm.put(null,"Berlin");
		hm.put(null,"LA");
		hm.put("Russia",null);
		hm.put("France",null);
		
		System.out.println(hm.get("India"));
		System.out.println(hm.get("UK"));
		
		hm.putIfAbsent("Pakistan", "Lahore");
		
		System.out.println(hm.get(null));
		
		// Iterator
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext())
		{
			String key = it.next();
			String value = hm.get(key);
			System.out.println("Key is "+key+" and value is "+value);
		}
		
		
		Iterator<Entry<String,String>> it1 = hm.entrySet().iterator();
		
		while(it1.hasNext())
		{
			Entry<String,String> entry = it1.next();
			
			System.out.println("Key is "+entry.getKey()+" value is "+entry.getValue());
			
		}
		
		// Comparison in hashmap
		
		HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
		
		hm1.put(1, "A");
		hm1.put(2, "B");
		hm1.put(3, "C");
		
		HashMap<Integer,String> hm2 = new HashMap<Integer,String>();
		
		hm2.put(3, "C");
		hm2.put(1, "A");
		hm2.put(2, "B");
		
		HashMap<Integer,String> hm3 = new HashMap<Integer,String>();
		
		hm1.put(1, "A");
		hm1.put(2, "B");
		hm1.put(3, "C");
		hm1.put(3, "D");
		
		// 1. Comparision on basis of key value pair
		
		System.out.println(hm1.equals(hm2));
		
		// 2. compare map using keyset
		
		System.out.println(hm1.keySet().equals(hm2.keySet()));
		
		// 3 find out extra key
		HashMap<Integer,String> hm4 = new HashMap<Integer,String>();
		
		hm1.put(1, "A");
		hm1.put(2, "B");
		hm1.put(3, "C");
		hm1.put(4, "D");
		
		HashSet<Integer> combineKey = new HashSet<Integer>(hm1.keySet());
		
		combineKey.addAll(hm4.keySet());
		System.out.println(combineKey);
		
		combineKey.removeAll(hm1.keySet());
		
		
		
		
		

	}

}
