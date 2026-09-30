package abstractdemo;

public class Triangle extends Area{
	
	int base, height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void cal_area() {
		// TODO Auto-generated method stub
		area = 0.5*base*height;
		
	}

}
