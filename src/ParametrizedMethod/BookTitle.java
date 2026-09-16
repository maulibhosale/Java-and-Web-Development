package ParametrizedMethod;

public class BookTitle {
	
	public void details(String title, String author, int year) {
		System.out.println(title + " by author " + author + "(" + year + ").");
	}
	
	public static void main(String[] args) {
		BookTitle d = new BookTitle();
		d.details("The Namesake", "Jhumpa Lahiri", 1945);
		d.details("The Monk Who Sold His Ferrari", "Robin Sharma", 2001);
		d.details("Atomic Habits", "James Clear", 1890);
	}

}
