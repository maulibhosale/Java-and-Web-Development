package exceptiondemo;

public class Demo6 {
	
	public static void main(String[] args) throws EvenNumberException
	{
		int num = 45;
		
		if(num%2==0) {
			throw new EvenNumberException();
		}
		else {
			System.out.println("Number is " +num+ ", it is a odd number");
		}
	}

}
