package abstractdemo;

public class Main {
	
	public static void main(String[] args) {
		Square s = new Square(12);
		System.out.println("Area of Square is: ");
		s.cal_area();
		s.displayArea();
		
		System.out.println();
		
		Circle c = new Circle(5);
		System.out.println("Area of Circle is: ");
		c.cal_area();
		c.displayArea();
		
		System.out.println();
		
		Rectangle r = new Rectangle(5,7);
		System.out.println("Area of Rectangle is: ");
		r.cal_area();
		r.displayArea();
		
		System.out.println();
		
		Triangle t = new Triangle(5, 8);
		System.out.println("Area of Triangle is: ");
		t.cal_area();
		t.displayArea();
	}

}
