package abstractdemo;

public class Circle extends Area {
	

	int radius;
	
	public Circle(int radius) {
		this.radius=radius;
	}

	@Override
	public void cal_area() {
		// TODO Auto-generated method stub
		area = 3.14*radius*radius;
	}
	
}
