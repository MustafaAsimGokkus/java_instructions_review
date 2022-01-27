package day28exceptions;

public class Exception01 {
public static void main(String[] args) {
	Object obj1 = 12;
	convert (obj1); // 12 or ClassCastException: If some data types can not be converted to 
	                // another data type, Java throws that exception "Object class cannot be casted to String"
	
	String s1 = "123";
	convertStringToInteger(s1); //This is integer: 123
	
	String s2 = "123b";
	convertStringToInteger(s2); //NumberFormatException: If you try to convert a String which has characters
	                            // different from digits you will get this exception 
	
	String s3 = "";              // Empty String gives NumberFormatException 
	convertStringToInteger(s3);
	
	
}

public static void convert (Object obj) {
	
	try {
	String convertedString = (String)obj;
	System.out.println(convertedString);
	} catch(ClassCastException e) {
		System.err.println("Some data types cannot be converted to other data types "+e.getMessage());
	}
}
public static void convertStringToInteger(String str) {
	try {
		int parsedString = Integer.parseInt (str);
		System.out.println("This is integer: "+ parsedString);
	  } catch (NumberFormatException e) {
		  System.err.println(str + "could not be parsed to integer "+ e.getMessage());
		  
	  }
	
	
	
}
}
