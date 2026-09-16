package staticmethod;

public class Demo {
	
	public static void display() {
		System.out.println("I am static method");
	}
	
	public static void cal_area(int l, int b) {
		int area = l * b;
		System.out.println("Area of rectangle is "+area);
	}
	
	public static int cube(int n) {
		return n*n*n;
	}
	
	public static void main(String[] args) {
		display();
		cal_area(2,3);
		System.out.println(cube(8));
	}

}
