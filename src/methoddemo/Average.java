package methoddemo;

public class Average {
	
	public void avg() {
		int a = 4;
		int b = 8;
		int c = 12;
		int d = 6;
		int e = 24;
		int average = (a+b+c+d+e) / 5;
		System.out.println(average);
	}
	
	public static void main(String[] args) {
		Average o = new Average();
		o.avg();
	}
	

}
