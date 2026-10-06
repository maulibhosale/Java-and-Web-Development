package interfacedemo;

public class Cylinder implements Operations{
	
	double v, a;
	
	public void calculate(int r, int h) {
		v = pi * r * r * h;
		a = 2 * pi * r * h + 2 * pi * r * r;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of cylinder is: " +a);
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		System.out.println("Volume of cylinder is: " +v);
	}

	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.calculate(4, 6);
		c.area();
		c.volume();
		
	}
	
}
