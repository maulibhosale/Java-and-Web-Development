package ParametrizedMethod;

public class Speed {
	
	public void details(int distance, int time) {
		double speed = distance / time;
		System.out.println(speed);
	}
	
	public static void main(String[] args) {
		Speed obj = new Speed();
		obj.details(60, 2);
	}

}
