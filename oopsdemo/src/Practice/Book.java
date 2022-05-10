package Practice;

public class Book {
	
	//properties
	private int bookId;
	private String bookName;
	private float price;
	private String publisher;
	
	//Generate getters and setters 
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	void display()
	{
		System.out.println("********Welcome to the bookshop*******");
	}
	float discountPrice()
	{
		return ((this.price)-(this.price*.10f));
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", publisher=" + publisher
				+ "]";
	}
	
	
	
	

}
