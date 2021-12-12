package dAY1;

import java.util.*;

public class ReverseALinkedList{
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//		reverseList(head);
		for(int i=0;i<list.size();i++) {
			list.get(i);
		}
		
	}
	
//	static Node head;
//
////	 static void add(int data) {
////		 Node toAdd = new Node(data);
////		 
////		 Node temp = head;
////		 while(temp.next != null) {
////			 temp = temp.next;
////		 }
////		 temp.next = toAdd;
////	 }
//	
//	 
//	static Node reverseList(Node head)
//	    {
//	        
//	        Node curr = head;
//	        Node prev = null;
//	        
//	        while(curr != null){
//	            Node temp = curr.next;
//	            curr.next = prev;
//	            prev = curr;
//	            curr = temp;
//	            
//	        }
//	        return prev;
//	    }
//	
////	 static void printList(Node node)
////	    {
////	        while (node != null) {
////	            System.out.print(node.data + " ");
////	            node = node.next;
////	        }
////	    }
//}
//
// class Node{
//    int data;
//    Node next;
//    
//    Node(int data){
//        this.data = data;
//        next = null;
//    }
//    
}
