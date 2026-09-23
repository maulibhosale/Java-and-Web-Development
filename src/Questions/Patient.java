package Questions;

// Hospital Management

public class Patient {
	
	int patientId, age ;
	long contactNumber ;
	String patientName;
	
	public void display(String patientName, int patientId, int age, int contactNumber) {
		this.age = age ;
		this.patientId = patientId ;
		this.contactNumber = contactNumber ;
		this.patientName = patientName ;
		System.out.println("Patient Name: " +patientName+ " ; Patient Id: " +patientId+ " ; Age: " +age+ " ; Contact Number: " +contactNumber);	
	}
	
}
