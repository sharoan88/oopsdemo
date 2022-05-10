package fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//Writer class used to write String/text data into a text file
public class WriterExample {
	
	public static void main(String[] args) {
		
		try
		{
			Writer w = new FileWriter("c:/demo/data.txt");
			
			String content = "She Sells Sea Shells In The Sea.programming by ved";
			
			w.write(content); //write contents into file
			w.close();
			System.out.println("Data written to the File");
			
		}
		catch(IOException e)
		{
			System.err.println("Error Occured");
			e.printStackTrace();
		}
		
	}

}
