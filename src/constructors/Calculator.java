package constructors;

public class Calculator {
	
	public Calculator(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Calculator c = new Calculator(3,5);
	}
	
}
