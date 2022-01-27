package day28exceptions;
/*
    1) If you get red underline while you type code
     it can be checked exception. Compile Time Exception
 
    2) The most common checked exceptions are 
                           i)FileNotFoundException:it is related with path issue and existence of the file  
                          ii) IOException: It is related with input and output issues
 
    3)IOException is the parent of FileNotFoundException because of that when you
    use IOException no need tyo use FileNotFoundException. But if you insist to use
    FileNotFoundException in try catch block FileNotFoundException must be in the first
    catch block.
 
    4)If you use e.printStackTrace(); inside the catch block you will get detailed technical message.
 

    */
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.IOException;

    public class Exception02 {

	public static void main(String[] args) throws IOException {
		readTextFiles2 ();
     
		
		
		
	}
    public static void readTextFiles1 () throws IOException  { 
	
	 // the meaning of FileNotFoundException is "call me" ==> IOException is parent of FileNotFoundException
	 
	 FileInputStream fis = new FileInputStream("src/day28exceptions/TextFile01");
		
	 int i = 0;
	 while ((i = fis.read()) != -1) {
		 System.out.print((char)i);
	 }
	 
	 
     }
 
     public static void readTextFiles2 ()  { 
		
	 // the meaning of FileNotFoundException is "call me" ==> IOException is parent of FileNotFoundException

	 FileInputStream fis = null; // null is an object for all classes (empty set)
	 
	 int i = 0;
	 
	try {
	
	fis = new FileInputStream("src/day28exceptionsx/TextFile01");// if address is right java accesses the file and puts it in
		                                             // the fis container and executes  finally fis.close() part "conn ended"
	while ((i = fis.read()) != -1) {
	 System.out.print((char)i);
    }
		
	} catch (FileNotFoundException e) {
		System.err.println("File doesn't exist or path is wrong");
	} catch (IOException e) {
		System.err.println("File cannot be read");
	}finally {
		try {
		fis.close();
		System.out.println("Conn. ended");
		} catch (Exception e) {
		System.err.println("File could not be closed maybe could not be accessed");
		}
	 } 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
