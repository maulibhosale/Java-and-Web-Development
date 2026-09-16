package ParametrizedMethod;

public class Circle {
	
	public void area(int r) {
		double ar = 3.14 * r * r ;
		System.out.println("Area is: " + ar);
		System.out.println();
		}
	
	public static void main(String[] args) {
		Circle r = new Circle();
		r.area(4);
		r.area(8);
	}
	
}
