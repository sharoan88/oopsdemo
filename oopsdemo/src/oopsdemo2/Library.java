package oopsdemo2;

import java.util.List;

//Composition Example
public class Library {
	
	List<Book> books;  //Objective-Reference---Composition
    
	//Constructor to initialize books in library
	public Library(List<Book> books) {
		this.books = books;
	}

	//
	public List<Book> getBooks() {
		return books;
	} 
	
	
	
	
	

}
