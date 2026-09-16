package ParametrizedMethod;

public class Visitors {
	
	public void vis(String value, int num) {
		System.out.println(value + ": " + num);
	}
	
	public static void main(String[] args) {
		Visitors s = new Visitors();
		s.vis("Visitors today", 20);
		s.vis("Students present", 39);
		s.vis("Total books", 345);
	}

}
