package book;

public class Book {
	private String bookName, bookAuthor, bookId, bookType;
	private int bookCopy;
	static int bookCounter = 0;
	public Book() {
		//Default Constructor..
	}
	public Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		this.bookType = bookType;
		this.bookCopy = bookCopy;
		bookCounter++;
	}
	public void showInfo() {
		System.out.println("Book Name: "+this.bookName+"\nBook Author: "+this.bookAuthor);
		System.out.print("Book ID:"+this.bookId+ "\tBook Type: "+this.bookType);
		System.out.println("Book Copy: "+this.bookCopy);
	}
	public void addBookCopy(int x) {
		this.bookCopy += x;
	}
	public static void showTotalBookInfo() {
		System.out.println("Book Counter= "+bookCounter);
		
	}
	
}
