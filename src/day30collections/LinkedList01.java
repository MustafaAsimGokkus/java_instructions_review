package day30collections;

import java.util.LinkedList;

public class LinkedList01 {
 public static void main(String[] args) {
	LinkedList <String> ll1 = new LinkedList <>();
	
	ll1.add("Ali");
	ll1.add("Can");
	ll1.add("Mark");
	ll1.add("Tom");
	
	//How to print LinkedList
	
	System.out.println(ll1);
	
	//How to get first element from a LinkedList
	
	String firstElement1 = ll1.element(); // element() returns the first element without removing (copy + paste)
	System.out.println(firstElement1);
	System.out.println(ll1);
	
	String firstElementRemoved  = ll1.poll(); // poll method returns the first element after removing (cut + paste)
	System.out.println(firstElement1);
	System.out.println(firstElementRemoved); // Ali
	System.out.println(ll1);
	
	
	String firstElement2 = ll1.getFirst(); // getFirst() returns the first element without removing (copy + paste)
	System.out.println(firstElement1);
	System.out.println(firstElement2);
	System.out.println(ll1);
	
	String firstElement3 = ll1.peek(); 
	System.out.println("==> " +firstElement3); // Can
	System.out.println(ll1);
	
	
	
	
	
	
	
	//How to get first element from an empty LinkedList
	LinkedList <String> ll2 = new LinkedList <>();
	//String firstElementFromEmptyLinkedList1 = ll2.element();
	//System.out.println(firstElementFromEmptyLinkedList1); // element() method throws NoSuchElementException for the empty LinkedList
	
	String firstElementFromEmptyLinkedList2 = ll2.peek(); //peek() method returns first element without removing 
	System.out.println(firstElementFromEmptyLinkedList2); // and it returns "null" for the empty LinkedList
	                                                     
	String firstElementFromEmptyLinkedList3 = ll2.poll();
	System.out.println(firstElementFromEmptyLinkedList3);
	System.out.println(ll2);
	
	//String firstElementFromEmptyLinkedList4 = ll2.getFirst(); // getFirst() method throws NoSuchElementException                                                           
	//System.out.println(firstElementFromEmptyLinkedList4);     // for the empty LinkedList
	
	// How to remove elements from a LinkedList
	LinkedList <Integer> ll3 = new LinkedList <>();
	ll3.add(0, 12); // When you use add(index,element) method make the indexes in ascending order
	ll3.add(1, 13);
	ll3.add(2, 10);
	ll3.add(3, 11);
	
	System.out.println(ll3);
	Integer first1 = ll3.remove();      //  Retrieves and removes the head (first element) of this list.
	System.out.println(first1);
	System.out.println(ll3); // [13,10,11]
	
	Integer first2 = ll3.remove(2);
	System.out.println(first2); // 11
	System.out.println(ll3);  // [13, 10]
	
	ll3.add(1, 13);
	ll3.add(2, 10);
	ll3.add(3, 13);     //[13,10,13,10,13]                  
	
	ll3.removeFirstOccurrence(13); //[10,13,10,13]
	System.out.println(ll3);            
	
	ll3.removeLastOccurrence(10);
	System.out.println(ll3); // [13, 10, 13]
	
	ll3.add(12);
	ll3.add(9);
	ll3.add(8);
	ll3.add(3);
	System.out.println(ll3);//[13, 10, 13, 12, 9, 8, 3]
	
	LinkedList <Integer> ll4 = new LinkedList <>();
	ll4.add(3);
	ll4.add(12);
	ll4.add(13);
	System.out.println(ll4); // [3,12,13]
	ll3.removeAll(ll4);
	System.out.println(ll3); // [10, 9, 8]  ==> from ll3 remove all elements of ll4
	
	// How to inser elements to LinkedList
	
	ll4.addAll(ll4); //[3,12,13]
	System.out.println(ll4); // [3, 12, 13, 3, 12, 13]

	ll4.addAll(1,ll3);          // ll3 ==> [10,9,8] adding multiple elements startingfrom a specific index
	System.out.println(ll4);    // [3,10,9,8,12, 13, 3, 12, 13]
	
	ll4.addFirst(100); 
	System.out.println(ll4);  // [100,3,10,9,8,12, 13, 3, 12, 13]
	
	
	ll4.addLast(900);            // [100, 3, 10, 9, 8, 12, 13, 3, 12, 13, 900] 
	System.out.println(ll4);      // add() and addLast() is exactly same.
	
	// How to update a specific node
	
	ll4.set(6, 200);
	System.out.println(ll4);  // [100, 3, 10, 9, 8, 12, 200, 3, 12, 13, 900]
	
	System.out.println(ll4.subList(3, 7));  // [9, 8, 12, 200]
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   }
}
