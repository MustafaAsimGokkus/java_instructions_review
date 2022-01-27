package day31collections;

import java.util.HashSet;
import java.util.TreeSet;

/*
 1)If you want to store unique elements in natural order use TreeSet
 
 */
public class TreeSet01 {

	public static void main(String[] args) {
	
		
	TreeSet <Integer> ts1 = new TreeSet<>();
	ts1.add(12);
	ts1.add(35);
	ts1.add(10);
	ts1.add(46);
	ts1.add(9);
	System.out.println(ts1); // [9, 10, 12, 35, 46]
	
	/*
	 How to store unique elements in natural order ==> TreeSet
	 Question:  TreeSet is very slow. How can you make it faster?
	 Answer:  i)I create a HashSet and add elements into HashSet
	         ii)I create a TreeSet and I convert HashSet to TreeSet
	 
	 */
	
	//1. way
	long t1 = System.nanoTime();
	TreeSet <String> ts2 = new TreeSet <>();
	ts2.add("K");
	ts2.add("Z");
	ts2.add("A");
	ts2.add("C");
	ts2.add("T");
	
	System.out.println(ts2); // [A, C, K, T, Z]
	long t2 = System.nanoTime();
	
	// 2. way ==> recommended
	
	HashSet <String> hs1 = new HashSet <>(); // fast
	hs1.add("K");
	hs1.add("Z");
	hs1.add("A");
	hs1.add("C");
	hs1.add("T");
	
	TreeSet <String> ts3 = new TreeSet <>(hs1);
	//System.out.println(ts3.addAll(hs1)); // // [A, C, K, T, Z]
	
	System.out.println(ts3);
	long t3 = System.nanoTime();
	
	System.out.println(t2-t1);
	System.out.println(t3-t2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
