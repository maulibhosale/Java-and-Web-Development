package ParametrizedMethod;

public class Multiply {
	
	public void mul(int a, int b) {
		int result = a * b;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Multiply m = new Multiply();
		m.mul(5, 6);
		m.mul(12, 13);
	}

}
