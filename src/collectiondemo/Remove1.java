package collectiondemo;

import java.util.*;

public class Remove1 {
	
	public static void main(String[] args) {
		HashSet<String>hs = new HashSet<String> ();
		hs.add("Apple");
		hs.add("Mango");
		hs.add("Banana");
		hs.add("Orange");
		
		System.out.println(hs);
		
		hs.remove("Mango");
		
		System.out.println(hs);
		
	}

}
