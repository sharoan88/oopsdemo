package exceptiondemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		 int a, b, result;
         Scanner input = new Scanner(System.in);
        
          System.out.println("Input two integers");
          a = input.nextInt();
          b = input.nextInt();  
          
          try //statements to be monitored which may throw exception
          {
        	  result=a/b;
        	  System.out.println("Result = "+result);
          }
          
          catch(ArithmeticException e) //exception thrown is handled in catch block
          {
        	  System.out.println("Divide by Zero Error-Enter non-zero value");
        	  System.out.println("Exception Description :"+e.getMessage());
        	  System.out.println("Exception Name and Description :"+e.toString());
        	  e.printStackTrace();
          }
          finally //clean-up operations
          {
        	  input.close();
        	  System.out.println("In Finally Block-Program execution ended");
          }
          
	}

}
