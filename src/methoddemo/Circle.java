package methoddemo;

public class Circle {
	
	public void area() {
		int r = 4;
		double area = 3.14 * r * r;
		System.out.println(area);
	}
	
	public void circumference() {
		int r = 4;
		double circumference = 2 * 3.14  * r;
		System.out.println(circumference);
	}
	
	public static void main(String[] args) {
		Circle o = new Circle();
		o.area();
		o.circumference();
	}
	
}
