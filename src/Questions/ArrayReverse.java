package Questions;

public class ArrayReverse {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		int n= arr.length ;
		System.out.println(n);
		System.out.println();
		
		for (int i=n-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}

}
