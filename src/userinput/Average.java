package userinput;

import java.util.Scanner;

public class Average {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
	    int b = sc.nextInt();
	    double c = sc.nextDouble();
	    
	    double total = a + b + c;
	    double avg = total / 3;
	    
	    System.out.println(avg);
	}

}
