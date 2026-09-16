package constructors;

public class Area {
	
	public Area(int l, int b) {
		int area = l * b;
		System.out.println("Area of rectangle is " + area);
	}
	
	public static void main(String[] args) {
		Area a = new Area(2, 3);
	}

}
