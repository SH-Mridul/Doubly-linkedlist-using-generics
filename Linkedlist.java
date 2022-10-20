package DoublyLinkedList;

public class Linkedlist<T> {
	//necessary field
	private Node<T> head;
	private Node<T> tail;
	private int size;
		
	//node structure
	private class Node<T>{
		private T val;
		private Node<T> previous;
		private Node<T> next;
		
		public Node(T val) {
			this.val = val;
		}
	}
	
	//in initial situation all is empty.
	public Linkedlist()
	{
		head = tail = null;
		size = 0;
	}
	
	
	//check empty or not
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	
	//length size
	public int length()
	{
		return size;
	}
	
	
	// add node into last
	public void addLast(T val)
	{
		Node<T> node = new Node<T>(val);
		
		if(isEmpty())
		{
			head = tail = node;
		}else {
			tail.next = node;
			node.previous = tail;
			tail = node;
		}
		size++;
	}
	
	// add node into first
	public void addFirst(T val)
	{
		Node<T> node = new Node<T>(val);
		if(isEmpty())
		{
			head =  tail = node;
		}else {
			node.next = head;
			head.previous = node;
			head = node;
		}
		
		size++;
	}
	
	
	//traverse
	public void traverse()
	{
		if(isEmpty())
			return;
		
		Node<T> current = head;
		while(current != null)
		{
			System.out.print(current.val+"\t");
			current = current.next;
		}
	}
	
	//traverse from backward
	public void traverseBackward()
	{
		if(isEmpty())
			return;
		
		Node<T> current = tail;
		while(current != null)
		{
			System.out.print(current.val+"\t");
			current = current.previous;
		}
	}
	
	//delete item from first
	public T deleteFirst()
	{
		T data = head.val;
		
		if(length() == 1)
		{
			head =  tail = null;
			size = 0 ;
		}else {
			
			head = head.next;
			head.previous = null;
			size--;
		}
		
		return data;
	}
	
	
	//delete from last
	public T deleteLast()
	{
		T data = tail.val;
		
		if(length() == 1)
		{
			head =  tail = null;
			size = 0 ;
		}else {
			
			tail = tail.previous;
			tail.next = null;
			size--;
		}
		
		return data;
	}
	
	// list to array
	public Object[] toArray()
	{
		Object items[] = new Object[size];
		
		Node current = head;
		int index = 0;
		while(current != null)
		{
			items[index++] = current.val;
			current = current.next;
		}
		
		return items;
	}
	
}
