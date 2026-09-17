package Questions;

import java.util.Scanner;

public class Search {
	
	public static void main(String[] args) {
		System.out.print("Enter the number you want to find in the array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println();
		
		
		int arr[] = {1,2,3,4,5,6,7,8};
		System.out.println("Given array is ");
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==n) {
				System.out.println(n + " is present in the array");
			}
		}
		
		
	}

}
