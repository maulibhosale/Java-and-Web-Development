package methoddemo;

public class Cube {
	
	public void area() {
		int a = 7;
		double area = 6 * a * a ;
		System.out.println(area);
	}
	
	public void perimeter() {
		int a = 7;
		double perimeter = 6 * a ;
		System.out.println(perimeter);
	}
	
	public void volume() {
		int a = 7;
		double volume = a * a * a ;
		System.out.println(volume);
	}
	
	public static void main(String[] args) {
		Cube obj = new Cube();
		obj.area();
		obj.volume();
		obj.perimeter();
	}

}
