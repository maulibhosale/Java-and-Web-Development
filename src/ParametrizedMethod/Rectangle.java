package ParametrizedMethod;

public class Rectangle {
	
	public void area(int l, int b) {
		int ar = l * b;
		System.out.println("Area is: " + ar);
		System.out.println();
		}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.area(3, 4);
		r.area(5, 6);
	}
	
}
