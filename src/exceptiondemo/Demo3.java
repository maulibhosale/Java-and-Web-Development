package exceptiondemo;

public class Demo3 {
	
	public static void main(String[] args) {
		int arr[] = {45, 65, 75, 85, 95, 105, 115};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		try {
			System.out.println(arr[8]);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(3);
	}

}
