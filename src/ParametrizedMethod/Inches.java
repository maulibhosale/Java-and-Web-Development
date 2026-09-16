package ParametrizedMethod;

public class Inches {
	
	public void number(int meter) {
		double inches = 0.0254 * meter;
		System.out.println (meter + " meter is " + inches + " inches.");
	}
	
	public static void main(String[] args) {
		Inches obj = new Inches();
		obj.number(100);
		obj.number(200);
		obj.number(300);
		obj.number(500);
	}

}
