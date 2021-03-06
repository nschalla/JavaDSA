package com.linkedlist;

public class SLinkedList<T extends Comparable<T>> {
	
	private Node<T> head;
	private int count = 0;
	public SLinkedList() {
	}
	public void inserAtHead(T data)
	 {
		Node<T> node = new Node<T>(data);
		if(head != null )
		{
			node.setNext(head);
		}
		head = node;
		 count++;
	}
	  
	public void insertAtTail(T data) {
		Node<T> node = new Node<T>(data);
		if(head == null) {
			head = node;
			return ;
		}
		Node<T> curr = head;
		while (curr.getNext() != null) {
			curr= curr.getNext();
			
		}
		curr.setNext(node);
		count++;
		
	}
	public void inserAtPosition(T data,int postion) 
	{
		if(postion <=  0) {
			inserAtHead(data);
		}
		Node<T> currNode = head;
		int currIndex =1;
		while(currIndex<postion && currNode.getNext()!=null) 
	   {
		currIndex++;
		currNode =currNode.getNext();
	  }
		Node<T> nextNode = currNode.getNext();
		Node<T> node = new Node<T>(data);
		currNode.setNext(node);
		node.setNext(nextNode);
		count++;
		
	}
	
	public  void deleteNodeAtBegin() {
		if(head == null ) {
			return ;
		}
		if(head.getNext() == null) {
			head = null;
		}
		Node<T> temp = head.getNext();
		head = temp;
		count--;
		
		
		
	}
	public  void deleteNodeAtEnd() {
		if(head == null ) {
			return ;
		}
		if(head.getNext() == null) {
			head = null;
		}
		Node<T> current = head;
				
		while(current.getNext().getNext()!= null) 
		{
			
			current = current.getNext();
		}
		 current.setNext(null);
		
		
		
		count--;
	}
		
		
	
	public int getCount() {
		return count;
	}
	
	@Override
	public String toString() {
		if(head == null) {return "";}
		
		return head.toString();
	}
	
	

}
