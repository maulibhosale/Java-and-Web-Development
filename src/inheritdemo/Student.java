package inheritdemo;

public class Student extends Person {
	
	int rollNo;
	String course;
	
	public void give(int rollNo, String course) {
		this.rollNo = rollNo;
		this.course = course;
		
		System.out.println("Roll no: " +rollNo);
		System.out.println("Course: " +course);
	}

}
