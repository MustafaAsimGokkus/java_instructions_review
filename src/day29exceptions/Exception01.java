package day29exceptions;

public class Exception01 {
public static void main(String[] args) {
	try {
		checkGrade(200);
	} catch (IllegalGradeException e) {
		System.err.println(e.getMessage());
   }
}
  public static void checkGrade (int grade) throws IllegalGradeException {
	  if(grade<0 || grade >100) {
		  throw new IllegalGradeException ("Make grade between 0-100");
	  } else {
		  System.out.println("Grade is: "+ grade);
	  }
	  
	  
	  
  }
  }
// Create custom compile time exception
/*
 1) You have to extend to Exception Class
 2)To be able to put ExceptionMessage on the conseole you should create a 
 constructor with String parameter like "public IllegalGradeException (String message)"
 3) Inside the constructor call parent constructor with message argument like "super(message)"
 4)After creating your own exception class you can use it in any method whenever you need
 by typing like "throw new IllegalGradeException ("Make grade between 0-100");" 
 
 
 
 
 
 
 
 
 
 */
class IllegalGradeException extends Exception{
	
	public IllegalGradeException (String message) {
		super(message);                            // when I get exception on the console I get a message from parent exception class
	}                                              // parent class has a function to print message like this. if sth. exists in Java 
	                                               // we do not type code for it
}










