package constructors;

public class Temperature {

	public Temperature(int temp_in_c) {
		double far = (temp_in_c * 1.8) + 32;
		System.out.println(far);
	}
	
	public static void main(String[] args) {
		Temperature t = new Temperature(100);
	}
	
}
