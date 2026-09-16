package arraydemo;

public class Demo {
	
	public static void main(String[] args) {
		
		int arr[] = {12,23,58,90,56,87,55,66,10};
		
		System.out.println(0);
		System.out.println(2);
		
		System.out.println(arr.length);
		
		System.out.println();
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		for(int t:arr) {
			System.out.println(t);
		}
		
	}

}
