package methoddemo;

public class Sphere {
	
	public void area() {
		int r = 8;
		double ar = 4 * 3.14 * r;
		System.out.println(ar);
	}
	
	public void volume() {
		int r = 8;
		double volume = (4/3) * 3.14 * r * r * r ;
		System.out.println(volume);
	}
	
	public static void main(String[] args) {
		Sphere obj = new Sphere();
		obj.area();
		obj.volume();
	}

}
