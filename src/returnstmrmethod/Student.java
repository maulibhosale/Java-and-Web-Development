package returnstmrmethod;

public class Student {
	
	public double marks(double sci, double maths, double history, double english) {
		double total_marks = sci+maths+history+english;
		double percentage = (total_marks * 100 ) / 400 ;
		return percentage;
	}
	
	public static void main(String[] args) {
		Student sc = new Student();
		System.out.println(sc.marks(91, 92, 91, 92));
		System.out.println(sc.marks(95, 89, 88, 82));
	}

}
