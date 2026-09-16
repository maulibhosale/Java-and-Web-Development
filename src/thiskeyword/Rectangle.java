package thiskeyword;

public class Rectangle {

	int length, breadth;
	
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	public void area () {
		int a = length*breadth;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(3,5);
		r.area();
	}
	
}
