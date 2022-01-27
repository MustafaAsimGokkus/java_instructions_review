package day27exceptions;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
     
		try {
		getPrintAge ();
		
		
            }catch (IllegalArgumentException e) {
		System.out.println("Age can't be negative...");
		
            }
	}
 // Create a method to get student's age and print it on the console
	public static void getPrintAge () {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your age...");
		int age = scan.nextInt();
		if(age>=0) {
			System.out.println("Your age is: " + age);
		}else {
			throw new IllegalArgumentException();   // new: new keyword to create object 
		                                        	// IllegalArgumentException();==> constructor of IllegalArgumentException
		}
		
	}
	
}
