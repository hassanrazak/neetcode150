package com.collections;

public class SinglyLinkedList{

	private static class Node{
		int data;
		Node next; 

		Node(int data){
		
			this.data = data; 
			this.next = null;
		}
	}

private Node head; 

	public void add(int data){
		Node newNode = new Node(data);

		if(head == null){
			head = newNode; 
			return;
		}

		Node temp = head; 
		while(temp.next != null){
			temp = temp.next;
		
		}

		temp.next = newNode; 
	}

public void reverse(){
	Node next = null; 
	Node current = head; 
	Node prev = null; 

	while(current != null){
	next = current.next; 
	current.next = prev; 
	prev = current; 
	current = next; 

	}
head = prev; 



}



public void printList(){
Node temp = head; 
while(temp !=null){
	System.out.print(temp.data + " - > ");
	temp = temp.next;
}

System.out.println("null");



}


public static void main(String[] args){
	SinglyLinkedList list = new SinglyLinkedList();

list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);

System.out.println("Original List");
list.printList();

list.reverse();
System.out.println("Reversed List");
list.printList();





}


}
