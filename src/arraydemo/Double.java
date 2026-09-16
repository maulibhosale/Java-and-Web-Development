package arraydemo;

public class Double {
	
	public double[] display() {
		double num[] = {2.90, 3.67, 13.88, 45.00, 89};
		return num;
	}
	
	public static void main(String[] args) {
		Double d = new Double();
		
		double check[] = d.display();
		for(double t:check) {
			System.out.println(t);
		}
	}

}
