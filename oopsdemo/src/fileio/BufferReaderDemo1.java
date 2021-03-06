package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.CharBuffer;

public class BufferReaderDemo1 {


	public static void main(String[] args) {
		
		 char[] array = new char[100];

		 

	        try {
	          // Suppose, the input.txt file contains the following text
	          // This is a line of text inside the file.
	          FileReader file = new FileReader("c:/demo/data.txt");

	 

	          // Creates a BufferedReader
	          BufferedReader input = new BufferedReader(file);

	 

	          // Skips the 5 characters
	          input.skip(5);

	 

	          // Reads the characters
	          input.read(array);

	 

	          System.out.println("Data after skipping 5 characters:");
	          System.out.println(array);

	 

	          // closes the reader
	          input.close();
	        }

	 

	        catch (Exception e) {
	          e.getStackTrace();
	        }
	}

}
