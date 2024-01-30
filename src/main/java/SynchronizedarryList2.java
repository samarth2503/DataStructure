import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedarryList2 {

	public static void main(String[] args) {
		
		List<String> nameofList  = Collections.synchronizedList(new ArrayList<String>());
		
		// Adding , removing we don't need explict synchronization 
		nameofList.add("Java");
		nameofList.add("Python");
		nameofList.add("Ruby");
		
		// For fetching value we need explict synchronized value
		
		synchronized(nameofList)
		{
			Iterator<String> it = nameofList.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		
		// 2. Thread safe ArrayList --> copyOnWriteArraysList
		
		CopyOnWriteArrayList<String> emp = new CopyOnWriteArrayList<String>();
		
		// we don't need explict synchronization method over here
		emp.add("Tom");
		emp.add("Naveen");
		emp.add("Steve");
		
		Iterator<String> it = emp.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
