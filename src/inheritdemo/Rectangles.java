package inheritdemo;

public class Rectangles extends Shape {

	int length , breadth;
	double area;
	
	public void check(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		
		area = length * breadth;
		
		System.out.println("Length is: " +length+ " and Breadth is: " +breadth);
		System.out.println("Area of the Rectangle is: " +area);
	}
	
	public static void main(String[] args) {
		Circles c = new Circles();
		c.displayShape("Circle");
		c.cal(4);
		
		System.out.println();
		
		Rectangles r = new Rectangles();
		r.displayShape("Rectangle");
		r.check(5, 6);
	}
	
	
	
}
