package ParametrizedMethod;

public class Students_percentage {
	
	public void details(String name, int roll_no, int sub1_marks, int sub2_marks) {
		int total_marks = sub1_marks + sub2_marks;
		int max_marks = 200;
		double percentage = (total_marks * 100) / max_marks ; 
		System.out.println (name + " Roll no " + roll_no + " has scored " + sub1_marks + "marks in Maths and " 
		+ sub2_marks + "marks in Science. Total marks scored is " + total_marks + ", and has scored "+ percentage +"% . Congratulations..!");
	}
	
	public static void main(String[] args) {
		Students_percentage std = new Students_percentage();
		std.details("Mauli", 22, 89, 80);
		std.details("Sourabh", 07, 75, 81);
		std.details("Sahil", 55, 90, 59);
		std.details("Omkar", 31, 69, 95);
	}

}
