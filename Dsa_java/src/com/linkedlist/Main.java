package com.linkedlist;

public class Main {

	public static void main(String[] args) {
//		//Every Method will return a new head
//		SinglyNode head = new SinglyNode(1);
//		SinglyNode firstNode = new SinglyNode(2);
//		SinglyNode secondNode = new SinglyNode(3);
//		head.next = firstNode;
//		firstNode.next = secondNode;
//		//hhead.printSingleNode(head);  
//		head.addatEnd(head, 4);
//		SinglyNode secondHead = head.addatBegin(head, 5);
//		//head.printSingleNode(secondHead);
//		SinglyNode thirdHead = head.deleteatBegin(secondHead);
//		head.printSingleNode(thirdHead);
//		head.deleteatEnd(thirdHead);
//		System.out.println("");
//		head.printSingleNode(thirdHead);
 
	SLinkedList<Integer> i = new SLinkedList<Integer>();
	i.inserAtHead(1);
	i.inserAtHead(2);
	i.insertAtTail(3);
	System.out.println(i);
	i.inserAtPosition(4, 2);
	System.out.println(i);
	System.out.println(i.getCount());
	i.deleteNodeAtBegin();
	System.out.println(i);
	System.out.println(i.getCount());
	System.out.println("-------------------");
	i.deleteNodeAtEnd();
	System.out.println(i);
	
	}

}
