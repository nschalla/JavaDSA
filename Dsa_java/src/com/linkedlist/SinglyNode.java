package com.linkedlist;

import java.net.SecureCacheResponse;

public class SinglyNode {
 int data;
 SinglyNode next;
public SinglyNode(int data) {
	super();
	this.data = data;
}
void printSingleNode(SinglyNode head){
	SinglyNode current = head;
	 while(current != null) {
		 System.out.print(current.data + "->");
	     current = current.next;  
	 }
	
}
SinglyNode addatBegin(SinglyNode head,int data) {
	SinglyNode newNode = new SinglyNode(data);
	if(head == null) {
		head = newNode;
	}
	newNode.next =head;
	head=newNode;
	return head;
	//return new Head
	
}   
SinglyNode addatEnd(SinglyNode head,int data) {  
	SinglyNode temp = new SinglyNode(data);
	SinglyNode current = head;
	if(current == null) {
		head= temp;
	}
	while(current.next!=null) {
		current = current.next;
	}
	current.next = temp;
	return head   ;
}
    

SinglyNode deleteatBegin(SinglyNode head) {
	if(head == null){
	return null;
	}
	return head.next ;
}   
SinglyNode deleteatEnd(SinglyNode head) {
	SinglyNode current = head;
	if(head == null) {
		return null;
	}
	if(head.next==null) {
		return null;
	}
	while(current.next.next!=null) {
		current= current.next;
	}
	current.next = null;
	return head;
	
	
	
	
}

}
