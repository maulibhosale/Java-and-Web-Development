package overloadingdemo;

public class Area {

	double area;
	
	public void cal_Area (int side) {
		area = side*side;
	}
	public void cal_Area (int len, int br) {
		area = len*br;
	}
	public void cal_Area (double radius) {
		area = 3.14*radius*radius;
	}
	
	public void display() {
		System.out.println("Area is " +area);
	}
	
	public static void main(String[] args) {
		Area a = new Area();
		a.cal_Area(4);
		a.display();
	}
	
}
