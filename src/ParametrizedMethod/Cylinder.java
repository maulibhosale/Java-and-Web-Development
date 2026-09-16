package ParametrizedMethod;

public class Cylinder {
	
	public void cyl(int r, int h) {
		double volume = 3.14 * r * r * h;
		double area = (2 * 3.14 * r * h ) + (2 * 3.14 * r * r);
		double surface_area = 2 * 3.14 * r * (r + h);
		System.out.println ("Cylinder volume is " + volume + " , area is " + area + " and surface area is " +  surface_area);
	}
	
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.cyl(5, 7);
		c.cyl(8, 9);
		c.cyl(6, 3);
	}

}
