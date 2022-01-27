package day29exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

	public static void main(String[] args) {
	List <String> list1 = new ArrayList <>();// I created an ArrayList object in List data type
	list1.add("Ali");
	list1.add("Can");
	list1.add("Ali Can");	
		
	System.out.println(list1);	
	// By using loops we can not update lists(collections)	
	for (String w:list1) {
		w+= "!";
	}
	System.out.println(list1);
	// loops can not update collections that's why java created a new 
	//structure 'iterator' to be able to update collections
	
	ListIterator list1Itr = list1.listIterator(); 
	
	while (list1Itr.hasNext()) {
		Object el = list1Itr.next();
		list1Itr.set(el+"%%%%");
	} System.out.println(list1);
	
	// How to remove all elements from list1 by using list iterator
	
	
	
	ListIterator list2Itr = list1.listIterator(); 
	while (list2Itr.hasNext()) {
		list2Itr.next();
		list2Itr.remove();  // remove() removes the element before the pointer
	} System.out.println("===>" + list1);
	
	
	List <String> list2 = new ArrayList <>();
	list2.add("A");
	list2.add("C");
	list2.add("B");	
	// How to print the elements of a list in reverse order by using iterator
	//to move pointer to the end type the following code
	ListIterator itr1 = list2.listIterator();//  [->A, C, B]
	//while (itr1.hasNext()) {
	//	itr1.next();
		
	// get the elements from the end
		
		while (itr1.hasPrevious()) {
			
		Object el = itr1.previous()	;
			
		System.out.print(el + " ");
	}
	// Add X,Y,Z to the end of the list2 by using Iterator
	while(itr1.hasNext()) {
		itr1.next();
		list2.add("X");
		list2.add("Y");
		list2.add("Z");
	System.out.println(list2);	
	// We have Iterator as well
	/*
	1) When you use Iterator you will not have i)hasPrevious ii)Previous iii)set() methods
	2) ListIterator can be used just with Lists but Iterator can be used with all collections. 
	 	 */
	Iterator itr2 = list2.iterator();
	while (itr2.hasNext()) {
		Object el = itr2.next();
		itr2.remove();
	}
		System.out.println("=>" + list2);
	}
		
		
		
	}
	
	
	
	
	}


