package loopingstm;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter login attempts: ");
		int attempts = sc.nextInt();
		
		System.out.print("Enter account status: ");
		String status = sc.next();
		
		int min_attempts = 3;
		
		
		if(attempts >= min_attempts) {
			System.out.println("You can't login as attemts exceed the acount should be blocked.");
		}
		else if (status.equals("false")) {
			System.out.println("You can't login as your account is blocked");
		}
		else {
			System.out.println("You can login to your account");
		}
		
	}

}
