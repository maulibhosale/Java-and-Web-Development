package ParametrizedMethod;

public class Book {
	
	public void details(String title, String author, int price) {
		System.out.println("Book details: Book title is " + title + " written by " + author + ", The price of the book is " + price + " ruppes.");
	}
	
	public static void main(String[] args) {
		Book d = new Book();
		d.details("The Namesake", "Jhumpa Lahiri", 330);
		d.details("The Monk Who Sold His Ferrari", "Robin Sharma", 225);
		d.details("Atomic Habits", "James Clear", 470);
	}

}
