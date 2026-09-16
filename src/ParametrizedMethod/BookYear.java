package ParametrizedMethod;

public class BookYear {
	
	public String details(String title, String author, int year) {
		return title + " by author " + author + "(" + year + ")." ;
	}
	
	public static void main(String[] args) {
		BookYear d = new BookYear();
		System.out.println(d.details("The Namesake", "Jhumpa Lahiri", 1945));
		System.out.println(d.details("The Monk Who Sold His Ferrari", "Robin Sharma", 2001));
		System.out.println(d.details("Atomic Habits", "James Clear", 1890));
	}

}
