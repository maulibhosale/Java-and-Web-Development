package abstractdemo;

public class Rectangle extends Area {
	
	int length, breadth;

	public Rectangle(int length, int breadth) {
		this.length= length;
		this.breadth= breadth;
	}

	@Override
	public void cal_area() {
		// TODO Auto-generated method stub
		area = length*breadth;
		
	}
	
}
