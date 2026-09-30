package abstractdemo;

public abstract class Area {
	
	double area;
	public void displayArea() {
		System.out.println(area);
	}
	public abstract void cal_area();
	
	public Area() {
		System.out.println("Abstract class constructor");
	}

}
