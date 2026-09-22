package inheritdemo;

public class Main {
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.cal_area_circle(2);
		c.displayarea("Circle");
		
		Rectangle r = new Rectangle();
		r.cal_area_rect(2,3);
		r.displayarea("Rectangle");
	}

}
