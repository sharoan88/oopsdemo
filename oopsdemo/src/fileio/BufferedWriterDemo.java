package fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	
	public static void main(String[] args) {
		try { 
            // Creating Writer obj in Append mode -true
            FileWriter writer = new FileWriter("c:/demo/names.txt",true);
            //Improves Efficiency While writing Data in to file
            BufferedWriter bwr = new BufferedWriter(writer); 
            
            bwr.write("\n");
            bwr.write("James"); 
            bwr.write("\n");
            bwr.write("\n"); // bwr.newLine();
            bwr.write("Hobert");
            bwr.write("\n");
            bwr.close(); 

 

            System.out.println("succesfully written to a file"); } 
            catch (IOException ioe) { 
            ioe.printStackTrace(); 

 

            }
	}

}
