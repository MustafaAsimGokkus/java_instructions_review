package day31collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/*
1) If you need a collection to store unique elements in insertion order use LinkedHashSet

 */
public class LinkedHashSet01 {

	public static void main(String[] args) {
	LinkedHashSet <Integer> lhs1 = new LinkedHashSet <>();
	lhs1.add(12);	
	lhs1.add(23);		
	lhs1.add(10);		
	lhs1.add(32);		
	lhs1.add(5);		
		
	System.out.println(lhs1);	
	// type code to display Arraylist elements in insertion order
	//Ex : ArrayList: [5,3,5,2,5,3] ==>  order is important [5,3,2]
			
			List<Integer> l1 = new ArrayList<>();		
			l1.add(5);
			l1.add(3);
			l1.add(5);
			l1.add(2);
			l1.add(5);
			l1.add(3);
			
			LinkedHashSet <Integer> lhs2 = new LinkedHashSet<>();
			lhs2.addAll(l1);
			
			System.out.println(lhs2);
		
		
		
		
		

	}

}
