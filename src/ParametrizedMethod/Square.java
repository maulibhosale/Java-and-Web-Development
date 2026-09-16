package ParametrizedMethod;

public class Square {
	
	public void area(int s) {
		int ar = s * s ;
		System.out.println("Area is: " + ar);
		System.out.println();
		}
	
	public static void main(String[] args) {
		Square r = new Square();
		r.area(4);
		r.area(8);
	}
	
}