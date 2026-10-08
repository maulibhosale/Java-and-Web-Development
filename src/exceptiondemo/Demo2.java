package exceptiondemo;

public class Demo2 {
	
	public static void main(String[] args) throws Exception
	{
		//System.out.println("Hello");
		//Thread.sleep(5000);              // compile time
		//System.out.println("World");
		
		System.out.println("Hello");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("World");
	}
	
}
