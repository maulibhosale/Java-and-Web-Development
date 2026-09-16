package methoddemo;

public class Square {
	
	public void perimeter() {
		int s = 8;
		int pr = 4 * s;
		System.out.println(pr);
	}
	
	public void area() {
		int s = 8;
		int ar = s * s;
		System.out.println(ar);
	}
	
	public static void main(String[] args) {
		Square obj = new Square();
		obj.perimeter();
		obj.area();
	}

}
