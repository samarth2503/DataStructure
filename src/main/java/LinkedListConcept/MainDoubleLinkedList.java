package LinkedListConcept;

public class MainDoubleLinkedList {

	public static void main(String[] args) {
		
		DoubleLinkedList dll = new DoubleLinkedList();
		
		dll.insertFirst(23);
		dll.insertFirst(45);
		dll.insertFirst(56);
		
		dll.display();
		
		dll.insertLast(67);
		
		dll.display();
	}

}
