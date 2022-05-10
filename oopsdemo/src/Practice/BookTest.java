package Practice;

public class BookTest {
	public static void main(String[] args) {

		Book b1 = new Book();

		//invoke setter methods
		b1.setBookId(101);
		b1.setBookName("Programming in C");
		b1.setPrice(500);
		b1.setPublisher("Prime Books");

		//invoke getter methods
		System.out.println("********Book Details********");
		b1.display();
		System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
		System.out.println("Discounted Price of Book :"+b1.discountPrice());
		System.out.println(b1);//invoke toString() method of the instance class


		Book b2 = new Book();

		//invoke setter methods
		b2.setBookId(102);
		b2.setBookName("Programming in Java");
		b2.setPrice(1000);
		b2.setPublisher("BPB Pubisher");

		//invoke getter methods
		System.out.println("********Book Details********");
		b2.display();
		System.out.println(b2.getBookId()+" "+b2.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
		System.out.println("Discounted Price of Book :"+b2.discountPrice());
		System.out.println(b2);//invoke toString() method of the instance class



	}
}
