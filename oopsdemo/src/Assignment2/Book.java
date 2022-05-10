package Assignment2;

import java.util.Scanner;

public class Book {
	 String bookName,authorName,publisher;
	 float bookPrice;
	 int numberOfPages;
	 
	 Scanner s = new Scanner(System.in);
	 
	 public void inputBookDetails()
	 {
		 System.out.println("Enter Book Name,Author Name,Publisher :");
		 bookName=s.next();
		 s.nextLine();
		 authorName=s.nextLine();
		 publisher=s.next();
		 System.out.println("Enter Bookprice,number of pages :");
		 bookPrice=s.nextFloat();
		 numberOfPages=s.nextInt(); 
	 }
	 public void displayBookDetails()
	 {
		 System.out.println("*********Book Details*********");
		 System.out.println("BookName   :"+bookName);
		 System.out.println("AuthorName :"+authorName);
		 System.out.println("Publisher  :"+publisher);
		 System.out.println("BookPrice  :"+bookPrice);
		 System.out.println("Number of pages :"+numberOfPages);
		 System.out.println("*********************************");
	 }
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
     	 

}
