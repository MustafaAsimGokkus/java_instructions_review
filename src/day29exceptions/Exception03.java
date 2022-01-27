package day29exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// How to read a text file line by line

public class Exception03 {

	public static void main(String[] args) {
		readTextFileLineByLine();
		
		
	}
 public static void readTextFileLineByLine () {
	 BufferedReader br = null;
	 try {
		br = new  BufferedReader (new FileReader("src/day29exceptions/TextFile01"));
		
		String line = br.readLine();
		
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		
	} catch (FileNotFoundException e) {
		
		System.out.println("Path is wrong or file does not exist");
	} catch (IOException e) {
	System.out.println("For some reason the file could not be read");
	} finally {
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("For some reason the file could not be closed");
		}catch (NullPointerException e) {
				System.out.println("You cannot close non-existing file");
		}
	}
 }
}
