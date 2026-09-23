package Questions;

public class Student extends Person {
	
	int roolNo, marks;
	String course;
	
	public void gett(int roolNo, String course, int marks) {
		this.roolNo = roolNo ;
		this.marks = marks ;
		this.course = course ;
		
		System.out.println("Rool Number: " +roolNo+ " , Course: " +course+ " , Marks: " +marks);	
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.display("Rachna", 21);
		s.gett(56, "EnTC", 49);
	}

}


