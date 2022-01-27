package day27exceptions;
/*
 
 Note: try block usage
 1)try + single catch
 2)try + multiple catch
 3)try+single catch+finally
 4)try+multiple catch + finally
 5)try+finally
 
 
 
 */



public class Exception01 {

	public static void main(String[] args) {

   
		String s1 = "123456789";
		String t1 = "xyz";
		divideLengthsofTwoGivenStrings5(s1,t1);
				
		String s2 = "";
		String t2 = "xy";
		divideLengthsofTwoGivenStrings5(s2,t2);
				
		String s3 = "Aliye Can";
		String t3 = "";
		divideLengthsofTwoGivenStrings5(s3,t3);
		
		String s4 = null;
		String t4 = "Ali";
		divideLengthsofTwoGivenStrings5(s4,t4);   // NullPointerException  null is a general object, empty set
		//if you use length() method with "null" object you will get NullPointerException
		
		
		String s5 = "Aliye Can";
		String t5 = "Ali";
		divideLengthsofTwoGivenStrings4(s5.substring(9),t5); //substring() can use "the length" as argument, it returns empty String
		
		String s6 = "Aliye CanXXX";
		String t6 = "Ali";
		divideLengthsofTwoGivenStrings4(s6.substring(10),t6);  // StringIndexOutOfBoundsException==> if you use non-existing indexes in a string
		
				
	}

	
	// Create a method to divide the length of 2 given Strings.
	
	
	public static void divideLengthsofTwoGivenStrings2 (String str1 , String str2) {
		
		int result = 0;
		
		try {
		    if(str1.equals("Aliye CanXXX")){
		    result = str1.substring(10).length()/str2.length();
		    }else {
		    	result = str1.length() / str2.length();
		    }
		    	
		    	
		    {
		    	
		    }
		
			System.out.println(result);
			
		}catch (ArithmeticException e ) {
			
			result = 1;
			System.out.println(result);
	
		} catch (NullPointerException e) {
		
			result = 0;
			System.out.println(result);
	
		}catch (RuntimeException e) {
			
			System.out.println("DOn't use non-existing indexes in String" + e.getMessage());
		}
					
		System.out.println(result);
		
	   }
	
	// If ArithmeticException occurs make the result 11, for other exceptions make the result 0

	
	    public static void divideLengthsofTwoGivenStrings4 (String str1 , String str2) {
		
		int result = 0;
		
		try {
		    if(str1.equals("Aliye CanXXX")){
		    result = str1.substring(10).length()/str2.length();
		    }else {
		    	result = str1.length() / str2.length();
		    }
		    	
		    	
		    {
		    	
		    }
		
			System.out.println(result);
			
		}catch (ArithmeticException e ) {
			
			result = 11;
			System.out.println(result);
	
		} catch (Exception e) {
		
			result = 0;
			System.out.println(result);
	
		
					
		System.out.println(result);
		
	   }
	
	
	
	    }	
	    // Even you get exception or not, I want to see "Mission is completed" message on the console
	    
		public static void divideLengthsofTwoGivenStrings5 (String str1 , String str2) {
			
			int result = 0;
			
			try {
			    if(str1.equals("Aliye CanXXX")){
			   
			    	result = str1.substring(10).length()/str2.length();
			   
			    }else {
			    	
			    result = str1.length() / str2.length();}
			   			
				System.out.println(result);
				
				
			}catch (ArithmeticException e ) {
				
				System.out.println("Do not divide by zero - " + e.getMessage());
				
				
			} catch (NullPointerException e) {
						
				System.out.println("Do not try to count number of characters for null object - " + e.getMessage() );
		        
				
			}catch (RuntimeException e) {
				
				System.out.println("DOn't use non-existing indexes in String" + e.getMessage());
				
		} finally {   // to disconnect from database "finally" is used mostly in real life.
			System.out.println("Mission is completed");
		}
				
  }
	    
	   
	    
	
}