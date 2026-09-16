package ifelseifstm;

public class demo {
	
	public static void main(String[] args) {
		
		int age = 16;
		
		if(age<18) {
			System.out.println("You are minor");
		}
		else if(age>=18 && age<60) {
			System.out.println("You are adult");
		}
		else {
			System.out.println("You are senior citizen");
		}
	}

}
