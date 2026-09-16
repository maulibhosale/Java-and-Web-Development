package ifelseifstm;

import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) {
		
		String user = "admin";
		String pass = "password123";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the username: ");
		String username = sc.next();
		System.out.print("Enter the password: ");
		String password = sc.next();
		
		if (username.equals(user)) {
			if (password.equals(pass)) {
				System.out.println("Login successful");
			}
			else {
				System.out.println("Incorrect credentials");
			}
		}
		else {
			System.out.println("Incorrect username");
		}
		
	}

}
