package collectiondemo;

import java.util.*;

public class Display3 {
	
	public static void main(String[] args) {
		
		HashSet<Integer>hs = new HashSet<Integer> ();
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(30);
		hs.add(20);
		hs.add(40);
		hs.add(50);
		
		System.out.println(hs.size());
	}
	

}
