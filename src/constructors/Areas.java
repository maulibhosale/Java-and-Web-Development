package constructors;

public class Areas {
	
	double area;
	public Areas(int side) {
		area = side * side;
	}
	public Areas(int len, int bre) {
		area = len * bre;
	}
	public Areas(double rad) {
		area = 3.14 * rad * rad;
	}
	public void display() {
		System.out.println("Area is " + area);
	}

	public static void main(String[] args) {
		Areas a = new Areas(2, 3);
		a.display();
	}
}
