package encapsulation;

public class Student {
	
	private int roll ;
	private String name, address, email;
	private double marks;
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
    	if (marks >= 0 && marks <= 100) {
    		this.marks = marks;
    	}
    	else {
    		System.out.println("Enter marks between 0-100");
    	}
    	
    }

	
}
