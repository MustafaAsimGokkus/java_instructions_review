package day31collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
   1)Set means collection with unique elements. If you want SSN use set. Not arrays
   2)"Hash" is a technique to create unique codes for every data
   3)HashSet works fast because it does not put the elements in any order
     i)insertion order 
     ii) natural order: alphabetical order or ascending order
     ArrayList LinkedList ==> insertion order
     HashSet puts the elements in "random order"
   4)HashSet accepts "null" as element just once.
   5)If you try to store repeated element into a set, Java will accept the 
   repeated elements just once. That rule is valid for "null" as well
 
  
 */
public class HashSet01 {

	public static void main(String[] args) {
		
    HashSet <String > hs1 = new HashSet <>();	
		
	
	hs1.add("K");
	hs1.add("K");
	hs1.add("K");
	hs1.add("K");
	hs1.add(null);
	hs1.add(null);
	System.out.println(hs1);
	
	
	 HashSet <String > hs2 = new HashSet <>();	
		
		
		hs2.add("K");
		hs2.add(null);
	
		// equals() method checks i) data types ii) number of elements iii)values of elements
		System.out.println(hs1.equals(hs2));
		
		hs1.remove(null); // true
		System.out.println(hs1); //[K]
		
		hs1.remove("X"); // false
		System.out.println(hs1); //[K]
		
		// type code to display Arraylist elements just once
		//Ex : ArrayList: [5,3,5,2,5,3] ==> [3,5,2] order is not important
		
		List<Integer> l1 = new ArrayList<>();		
		l1.add(5);
		l1.add(3);
		l1.add(5);
		l1.add(2);
		l1.add(5);
		l1.add(3);
		
		HashSet <Integer> hs3 = new HashSet<>();
		hs3.addAll(l1);
		
		System.out.println(hs3);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
