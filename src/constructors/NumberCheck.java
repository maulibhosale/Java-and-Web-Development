package constructors;

public class NumberCheck {

	public NumberCheck(int num) {
		if (num > 0) {
			System.out.println("Positive number");
		}
		else if (num == 0) {
			System.out.println("Number is zero");
		}
		else {
			System.out.println("Negative number");
		}
	}
	
	public static void main(String[] args) {
		NumberCheck n = new NumberCheck(1);
	}
	
}
