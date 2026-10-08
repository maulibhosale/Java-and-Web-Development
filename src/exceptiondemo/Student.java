package exceptiondemo;

public class Student {
	
	public static void check(int marks) throws FailException
	{
		
		if (marks < 35) {
			throw new FailException();
		}
		else {
			System.out.println("Student passed in exam");
			System.out.println("Student score is " +marks);
		}
	}
	
	public static void main(String[] args) {
		try {
			check(52);
		} catch (FailException e) {
			e.printStackTrace();
		}
	}

}
