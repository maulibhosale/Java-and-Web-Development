package inheritdemo;

public class Circles extends Shape{
	
	int radius;
	double area;
	
	public void cal(int radius) {
		this.radius = radius;
		
		area = 2 * 3.14 * radius;
		
		System.out.println("Circle radius is: " +radius);
		System.out.println("Area of the Circle is: " +area);
		
	}

}
