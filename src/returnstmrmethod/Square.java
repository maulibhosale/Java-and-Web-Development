package returnstmrmethod;

public class Square {
	
	public String display(int num) {
		return "Square of " + num + " is: " + num * num;
	}
	
	public static void main(String[] args) {
		Square sc = new Square();
		System.out.println(sc.display(8));
	}

}
