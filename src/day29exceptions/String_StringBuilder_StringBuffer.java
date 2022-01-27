package day29exceptions;

public class String_StringBuilder_StringBuffer {

	public static void main(String[] args) {
	
	/*
	 1) StringBuffer and StringBuilder are mutable classes
	 2)StringBuffer(Java1) is created before StringBuilder(Java5) in Java
	 3)StringBuffer is thread-safe and synchronized class
	   StringBuilder is not thread-safe and synchronized class	
	 	
	 	
	 */
		
		StringBuffer sbr = new StringBuffer();
		System.out.println(sbr.capacity());//16
		
		StringBuffer sbr2 = new StringBuffer("Java");
		System.out.println(sbr2.capacity());//20 
		
		StringBuffer sbr3 = new StringBuffer(7);
		System.out.println(sbr3.capacity());//7
		
	    sbr3.append("Java");
		System.out.println(sbr3.capacity());//7
		
		sbr3.append("is good");
		System.out.println(sbr3.capacity());//7*2+2=16 ==> If you send more characters than the capacity new capacity is cap*2+2
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
