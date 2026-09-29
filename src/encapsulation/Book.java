package encapsulation;

public class Book {
	
	private String title, author;
	private int price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public static void main(String[] args) {
		Book b = new Book();
		b.setTitle("Atomic Habits");
		b.setAuthor("John Fernandez");
		b.setPrice(250);
		
		System.out.println("Book Details:-");
		System.out.println("Book title: " +b.getTitle());
		System.out.println("Book author: " +b.getAuthor());
		System.out.println("Book price: " +b.getPrice());
	}

}
