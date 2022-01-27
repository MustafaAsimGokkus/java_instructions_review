package day28exceptions;
/* Note: If you create an Exception it is called custom exception 
 To create a checked exception:
 1)Create exception class  ==> as inner class
 2)Extend to Exception ==>"public static class  IllegalGradeException extends Exception{.....}"
 3)Create constructor with "String message" parameter  and put super "message"
 inside the constructor.
 */
public class Exception03 {

	public static void main(String[] args) throws IllegalGradeException {
	
		
		checkGrade(155);
	

	}

	// Create illegal grade exception.Grade is between 0-100
	//if grade is not in that area create "IllegalGradeException"
	
	public static void checkGrade(int grade) throws IllegalGradeException {
		if (grade<0 || grade >100) {
		throw new IllegalGradeException	("Grade must be between 0 and 100 ");
		}System.out.println("Your grade is: "+ grade);
	} 
	
	
	
	
	public static class  IllegalGradeException extends Exception{
		
	public	IllegalGradeException(String message) {
		super(message);
	}
		
		
	}
	
}
