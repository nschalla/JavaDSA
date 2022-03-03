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
	
	
	
	@Override
	public String toString() {
		if(head == null) {return "";}
		
		return head.toString();
	}
	
	

}