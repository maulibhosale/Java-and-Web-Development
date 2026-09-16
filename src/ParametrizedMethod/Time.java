package ParametrizedMethod;

public class Time {
	
	public void details(int distance, int speed) {
		double time = distance / speed ;
		System.out.println(time);
	}
	
	public static void main(String[] args) {
		Time obj = new Time();
		obj.details(120, 60);
	}

}
