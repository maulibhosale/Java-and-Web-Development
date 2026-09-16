package loopingstm;

public class time {
	
	public void Check(int hours , int minutes) {
		if ( hours >= 5 && hours < 11 ) {
			System.out.println("Good morning!!");
		}
		else if (hours >= 11 && hours < 16) {
			System.out.println("Good afternoon");
		}
		else if (hours >= 16 && hours < 20) {
			System.out.println("Good evening");
		}
		else {
			System.out.println("Good night");
		}
	}
	
	public static void main(String[] args) {
		
		time in = new time();
		in.Check(4, 29);
		
	}

}
