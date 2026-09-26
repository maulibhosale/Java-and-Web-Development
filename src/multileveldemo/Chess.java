package multileveldemo;

public class Chess extends BoardGames {
	
	private void gett() {
		
		System.out.println("Chess is a board game");
		System.out.println("Its a multi-player game");

	}
	
	public static void main(String[] args) {
		Chess c = new Chess();
		c.display();
		c.give();
		c.gett();
	}

}
