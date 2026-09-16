package constructors;

public class EvenOrOdd {

	public EvenOrOdd(int num) {
	    if (num == 0) {
	    	System.out.println("Enter non zero number");
	    }
		else if (num % 2 == 0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
	}
	
	public static void main(String[] args) {
		EvenOrOdd n = new EvenOrOdd(5);
	}
	
}
