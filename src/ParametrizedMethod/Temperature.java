package ParametrizedMethod;

public class Temperature {

	public void number(int fahrenheit) {
		double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
		System.out.println (fahrenheit + "F is " + celsius + "C.");
	}
	
	public static void main(String[] args) {
		Temperature obj = new Temperature();
		obj.number(100);
		obj.number(80);
		obj.number(75);
		obj.number(93);
	}
	
}
