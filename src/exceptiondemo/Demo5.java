package exceptiondemo;

public class Demo5 {
	
	static String name = "MauliBhosale";
	
	public static void main(String[] args) throws Exception
	{
		if(name.length() > 5) {
			throw new Exception("String length is greater then 5");
		}
		else {
			System.out.println(name);
		}
	}

}
