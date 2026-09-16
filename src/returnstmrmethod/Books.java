package returnstmrmethod;

public class Books {
	
	public String details(String title, String author, int price) {
		return title + " ,by author " + author + " (" + price + "rs)." ;
	}

	public static void main(String[] args) {
		Books b = new Books();
		System.out.println(b.details("The Namesake", "Jhumpa Lahiri", 300));
		System.out.println(b.details("The Monk Who Sold His Ferrari", "Robin Sharma", 225));
		System.out.println(b.details("Atomic Habits", "James Clear", 312));
	}
}
