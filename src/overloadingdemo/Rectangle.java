package overloadingdemo;

public class Rectangle {

	double area;
	int len;
	int br;
	
	public void cal_Area() {
		len = 0;
		br = 0;
		area = len*br;
	}
	
	public void cal_Area(int a) {
		len = a;
		br = a;
		area = len*br;
	}
	
	public void cal_Area(int len, int br) {
		area = len*br;
	}
	
	public void display() {
		System.out.println("Area is " +area);
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.cal_Area(4,3);
		r.display();
	}
	
}
