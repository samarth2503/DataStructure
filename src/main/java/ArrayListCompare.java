import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1.equals(l2));
		
		// Compare tow list and find additional element or missing element
		
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		System.out.println(l4.removeAll(l3));
		
		System.out.println("After removing element "+l4);
		
		// Find common element
		
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("Java","Python","Ruby","C#","JS"));
		
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("Java","Python","Ruby","C#","PHP"));
		
		l5.retainAll(l6);
		
		System.out.println(l5);
		
		

	}

}
