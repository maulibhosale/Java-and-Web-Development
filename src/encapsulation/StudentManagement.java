package encapsulation;

public class StudentManagement {
	
	private int StdId, Age; 
	private String Name, Course, Grade;
	
	public int getStdId() {
		return StdId;
	}
	public void setStdId(int stdId) {
		StdId = stdId;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	
	
	
	public StudentManagement(int stdId, int age, String name, String course, String grade) {
		this.StdId = stdId;
		this.Age = age;
		this.Name = name;
		this.Course = course;
		this.Grade = grade;
	}
	
	public static void main(String[] args) {
		StudentManagement s = new StudentManagement(101, 21, "Mauli", "Computer Engineering", "A+");
		
		System.out.println("Student Management System:-");
		System.out.println("Name: " +s.getName());
		System.out.println("Id: " +s.getStdId());
		System.out.println("Age: " +s.getAge());
		System.out.println("Course: " +s.getCourse());
		System.out.println("Grade: " +s.getGrade());
		
	}
	

}
