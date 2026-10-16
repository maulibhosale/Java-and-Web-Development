package collectiondemo;

import java.util.*;

public class Check1 {
	
	public static void main(String[] args) {

		HashSet<Integer>hs = new HashSet<Integer> ();
		hs.add(5);
		hs.add(10);
		hs.add(15);
		hs.add(20);
		hs.add(25);
		
		System.out.println(hs.contains(15));
		System.out.println(hs.contains(100));
		
		
	}

}
