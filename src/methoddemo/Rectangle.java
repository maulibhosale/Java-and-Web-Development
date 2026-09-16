package methoddemo;

public class Rectangle {
	
	public void perimeter() {
		int l = 5;
		int b = 7;
		int pr = 2 * (l + b);
		System.out.println(pr);
	}
	
	public void area() {
		int l = 5;
		int b = 7;
		int ar = l * b;
		System.out.println(ar);
	}
	
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.perimeter();
		obj.area();
	}

}
