package ParametrizedMethod;

public class Distance {
	
	public void details(int speed, int time) {
		double distance = speed * time;
		System.out.println(distance);
	}
	
	public static void main(String[] args) {
		Distance obj = new Distance();
		obj.details(60, 2);
	}

}
