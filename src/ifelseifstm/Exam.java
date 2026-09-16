package ifelseifstm;

public class Exam {
	
	public void check (int attendance, boolean medical_leave) {
		if(attendance<75) {
			if(medical_leave) {
				System.out.println("You are eligible for the exam");
			}
			else {
				System.out.println("You are not eligible for the exam");
			}	
		}
		else {
			System.out.println("You are eligible for the exam");
		}
	}
	
	public static void main(String[] args) {
		
		Exam n = new Exam();
		n.check(50, true);
		
	}

}
