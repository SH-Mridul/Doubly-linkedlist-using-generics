package DoublyLinkedList;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
	  Linkedlist<String> list = new Linkedlist<String>();
	  //add first
	  list.addFirst("mridul");
	  list.addFirst("muba");
	  
	  //add last
	  list.addLast("upama");
	  
	  //forward to backward
	  //list.traverse();
	  
	  //backward to forward
	  //list.traverseBackward();
	  
	 
	  list.addFirst("sakib");
	  list.addFirst("bijoy");
	  
	  //delete
	  var a = list.deleteFirst();
	  var b = list.deleteLast();
	  
	  System.out.println(a);
	  System.out.println(b);
	  
	  System.out.println(Arrays.toString(list.toArray()));
	}
}
