package constructors;

public class Average {

	public Average(int m1, int m2, int m3) {
		int average = ( m1 + m2 + m3 ) / 3;
		System.out.println(average);
	}
	
	public static void main(String[] args) {
		Average a = new Average(30,35,38);
	}
	
}
