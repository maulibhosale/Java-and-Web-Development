package abstractdemo;

public class Square extends Area{

	int side;
	
	public Square(int side) {
		this.side=side;
	}
	
	@Override
	public void cal_area() {
		area = side*side;
	}
	
}
