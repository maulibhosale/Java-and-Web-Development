package collectiondemo;

import java.util.*;

public class Demo2 {
	
	public static void main(String[] args) {
		HashSet<String>hs = new HashSet<String> ();
		hs.add("apple");
		hs.add("orange");
		hs.add("banana");
		hs.add("berries");
		hs.add("guava");
		hs.add("apple");
		hs.add("orange");
		hs.add("grapes");
		System.out.println(hs);
		
		System.out.println(hs.size());
		System.out.println(hs.contains("apple"));
		hs.remove("apple");
		System.out.println(hs);
		System.out.println(hs.contains("apple"));
		//hs.clear();
		System.out.println(hs);
		
		for(String s: hs) {
			System.out.println(s);
		}
	}

}
