package day26exceptions;

/*
  1) Exception is unexpected issue
  2)If there is any exception
   i)Stops execution
   ii)throws exception
  
 */

public class Exception01 {

	public static void main(String[] args) {
		
		System.out.println(division(12,3));
		System.out.println(division(10,10));
		System.out.println(division(0,10));
		System.out.println(division(10,0));  //ArithmeticException
		System.out.println("hello");
				
		int arr[ ]= {2,3,7,1,5};
				
		System.out.println(addTwoConsecutiveArrayElements (arr,1));
		System.out.println(addTwoConsecutiveArrayElements (arr,3));
		System.out.println(addTwoConsecutiveArrayElements (arr,3));
		System.out.println(addTwoConsecutiveArrayElements (arr,4)); // ArrayIndexOutOfBoundsException
	
	  int brr [] = {12,6,0,1,1};
	 System.out.println(divideTwoConsecutiveArrayElements (brr,0));
	 System.out.println(divideTwoConsecutiveArrayElements (brr,1)); 
	 System.out.println(divideTwoConsecutiveArrayElements (brr,2)); // Exception will be handled over here
	 System.out.println(divideTwoConsecutiveArrayElements (brr,3));
	 System.out.println(divideTwoConsecutiveArrayElements (brr,4));// Exception will be handled over here
	}

	public static double division (int a, int b) {
		
		int result = 0;
		try {
			
			result = a/b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
				
		return result;
	}
	
	public static int addTwoConsecutiveArrayElements(int arr[], int index) {
		
		int result = 0;
		try {
		result =  arr[index]+ arr[index+1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Don't use non-existing indexes: " + e.getMessage());
		}
		return result;
		
	}

	
	public static double divideTwoConsecutiveArrayElements(int arr[], int index) {
		
		double result = 0;
		try {
	  result =  arr[index] / arr[index+1];
		} catch (ArithmeticException e) {
			System.out.println("dont divide by 0 " +e.getMessage());
		} catch(IndexOutOfBoundsException e ) {
			System.out.println("dont use non existing index "+ e.getMessage());
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
