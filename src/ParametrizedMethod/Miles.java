package ParametrizedMethod;

public class Miles {
	
	public void distance(int km) {
		double miles = km * 0.621371;
		System.out.println(miles);
	}
	
	public static void main(String[] args) {
		Miles obj = new Miles();
		obj.distance(100);
	}

}
