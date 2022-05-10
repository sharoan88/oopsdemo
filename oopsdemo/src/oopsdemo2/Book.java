package oopsdemo2;
//Composition Example

import java.util.ArrayList;
import java.util.List;

public class Book {
	
	String title,author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// Creating the Objects of Book class.
    Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
    Book b2 = new Book("Thinking in Java", "Bruce Eckel");
    Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");
     
    // Creating the list which contains the
    // no. of books.
    List<Book> books = new ArrayList<Book>();
    books.add(b1);
    books.add(b2);
    books.add(b3);
    
    List<Book> bks = lib.getTotalBooksInLibrary();
    for(Book bk : bks){
         
        System.out.println("Title : " + bk.title + " and "
        +" Author : " + bk.author);
}
	

}
