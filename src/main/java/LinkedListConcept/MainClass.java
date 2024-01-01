package LinkedListConcept;

import LinkedListConcept.LL.Node;

public class MainClass {

	public static void main(String[] args) {
		
		LL l = new LL();
		
		l.insertFirst(100000);
		l.insertFirst(1);
//		l.insertFirst(2);
//		l.insertFirst(4);
		
//		l.insertLast(78);
//		
//		l.insert(100, 3);
//		
//		l.display();
//		
//		System.out.println("Fisrt Element to be deleted it "+l.deleteFirst());
//		
//		l.display();
//		
//		System.out.println("Deleted Elemtn is "+l.deleteLast());
//		
//		l.display();
//		
//		System.out.println("Element remeoved from 1st Index is "+l.delete(1));
		
		
//		System.out.println(l.deleteDuplicate());
		
//		l.removeElements(6);
		
		l.display();
		
		//l.reverseNode();
		
		
		
		Node n = l.getMiddle();
		
		l.reverseNode(n);
		
		while(n!=null)
		{
			System.out.println(n.value);
			n = n.next;
		}
		l.display();
		
		
		
		//l.display();
	}

}
