package arraydemo;

public class Colors {

	public static void main(String[] args) {
		
		String arr[] = {"Yellow", "Red", "Green", "Blue", "Violet", "White"};
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		for(String t:arr) {
			System.out.println(t);
		}
		
	}
	
}
