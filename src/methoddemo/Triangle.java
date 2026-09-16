package methoddemo;

public class Triangle {
	
	public void perimeter() {
		int a = 3;
		int b = 4;
		int c = 5;
		int pr = a + b + c;
		System.out.println(pr);
	}
	
	public void area() {
		int a = 3;
		int b = 4;
		int c = 5;
		double ar = 0.5 * a * b;
		System.out.println(c);
		System.out.println(ar);
	}
	
	public static void main(String[] args) {
		Triangle obj = new Triangle();
		obj.perimeter();
		obj.area();
	}

}
