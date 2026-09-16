package methoddemo;

public class Cylinder {
	
	public void volume() {
		int r = 3;
		int h = 4;
		double vol = 3.14 * r * r * h;
		System.out.println(vol);
	}
	
	public void area() {
		int r = 3;
		int h = 4;
		double ar = (2 * 3.14 * r * h) + (2 * 3.14 * r * r);
		System.out.println(ar);
	}
	
	public void surfacearea() {
		int r = 3;
		int h = 4;
		double sar = 2 * 3.14 * r * ( r + h) ;
		System.out.println(sar);
	}
	
	public static void main(String[] args) {
		Cylinder obj = new Cylinder();
		obj.volume();
		obj.area();
		obj.surfacearea();
	}

}
