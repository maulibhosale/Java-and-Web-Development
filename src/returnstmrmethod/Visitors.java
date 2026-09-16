package returnstmrmethod;

public class Visitors {
	
	public String visit(String msg, int num) {
		return msg + ": " + num ;
	}

	public static void main(String[] args) {
		Visitors v = new Visitors();
		System.out.println(v.visit("Visitors today", 30));
	}
}
