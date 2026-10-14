package collectiondemo;

import java.util.*;
import java.util.Scanner;

public class Demo7 {	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		
		LinkedList<Integer>number = new LinkedList<Integer> ();
		
		System.out.println("Enter elements: ");
		for(int i = 0; i < n; i++) {
			number.add(sc.nextInt());
		}
		
		System.out.println(number);
		sc.close();
		
	}

}
