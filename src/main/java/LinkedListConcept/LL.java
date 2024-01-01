package LinkedListConcept;

public class LL
{
	private Node head;
	private Node tail;
	private int size;
	
	public LL()
	{
		this.size = 0;
	}
	
	public void insertFirst(int val)
	{
		Node n = new Node(val);
		n.next = head;
		head = n;
		
		if(tail==null)
		{
			tail = head;
		}
		
		size+=1;
	}
	
	public void display()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.value+ " -> ");
			temp = temp.next;
		}
		
		System.out.println("END");
		
	}
	
	public void insert(int val,int index)
	{
		if(index==0)
		{
			insertFirst(val);
			return;
		}
		
		if(index==size)
		{
			insertLast(val);
			return;
		}
	
		Node temp = head;
		
		for(int k=1;k<index;k++)
		{
			temp = temp.next;
		}
		
		Node n = new Node(temp.next,val);
		temp.next = n;
		
		size++;
	}
	
	public int deleteFirst()
	{
		int val = head.value;
		head = head.next;
		size--;
		
		return val;
	}
	
	public Node get(int index)
	{
		Node n = head;
		
		for(int i=0;i<index;i++)
		{
			n = n.next;
		}
		
		return n;
	}
	
	public int deleteLast()
	{
		if(size<=1)
		{
			return deleteFirst();
		}
		
		Node n = get(size-2);
		int val = tail.value;
		
		n.next = null;
		tail = n;
		return val;
	}
	
	public int delete(int index)
	{
		if(index == 0)
		{
			return deleteFirst();
		}
		
		if(index == size-1)
		{
			return deleteLast();
		}
		
		Node previous = get(index-1);
		int value = previous.next.value;
		previous.next = previous.next.next;
				
		return value;
		
	}
	
	public void insertLast(int val)
	{
		Node n = new Node(val);
		
		if(tail==null)
		{
			insertFirst(val);
			return;
		}
		
		tail.next = n;
		tail = n;
		size++;
	}
	
	public Node deleteDuplicate()
	{
		Node first = head;
        
        while(first.next!=null)
        {
            
            if(first.value==first.next.value)
            {
            	first.next = first.next.next;
            }
            else
            {
            	//first.next = first.next.next;
                
                first = first.next;   
            }
        }
        tail = first;
        tail.next = null;
        
        return first;
	}
	
	public Node removeElements(int val) {
        
        Node n = head;
        
        while(n!=null)
        {
            if(n.value == val)
            {
                n = n.next.next;
            }
            else
            {
                n = n.next;
            }
        }
            
        return head;
    }
	
	public Node reverseNode()
	{
		Node n = head;
		Node prev = null;
		Node next = n.next;
		
		while(n!=null)
		{
			n.next = prev;
			prev = n;
			n = next;
			if(next!=null)
			{
				next=next.next;
			}
		}
		
		head=prev;
		
		return n;
	}
	
	public Node getMiddle() {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}
	
	public Node reverseNode(Node head)
    {
        Node n = head;
		Node prev = null;
		Node next = n.next;
        
        while(n!=null)
		{
			n.next = prev;
			prev = n;
			n = next;
			if(next!=null)
			{
				next=next.next;
			}
		}
        
        head = n;
        
        return head;
    }
	

	
	public class Node
	{
		public int value;
		public Node next;
		
		public Node(int value)
		{
			this.value = value;
		}
		
		public Node(Node next,int value)
		{
			this.next = next;
			this.value = value;
		}
		
	}
	
	
	
}