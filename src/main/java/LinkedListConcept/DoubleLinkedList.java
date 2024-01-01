package LinkedListConcept;

public class DoubleLinkedList {
	
	Node head;
	
	public void insertFirst(int val)
	{
		Node n = new Node(val);
		
		n.next = head;
		n.prev = null;
		
		if(head!=null)
		{
			head.prev = n;
		}
		
		head = n;
	}
	
	public void display()
	{
		Node n = head;
		
		while(n!=null)
		{
			System.out.print(n.value+"--->");
			n = n.next;
		}
		System.out.println("END");
		
	}
	
	public void insertLast(int val)
	{
		Node n = head;
		Node newNode = new Node(val);
		
		newNode.next = null;
		if(head==null)
		{
			newNode.prev = null;
			head = newNode;
			
		}
		
		while(n.next!=null)
		{
			n = n.next;
		}
		
		n.next = newNode;
		newNode.prev = n;
		
	}
	
	private class Node
	{
		private Node next;
		private Node prev;
		private int value;
		
		public Node(int value)
		{
			this.value = value;
		}
		
		public Node(int value,Node next)
		{
			this.value = value;
			this.value = value;
		}
	}

}
