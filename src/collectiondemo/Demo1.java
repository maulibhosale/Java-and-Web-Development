package collectiondemo;

import java.util.*;

public class Demo1 {
	
	public static void main(String[] args) {
		TreeSet<String>ts = new TreeSet<String> ();
		ts.add("apple");
		ts.add("orange");
		ts.add("banana");
		ts.add("berries");
		ts.add("guava");
		ts.add("apple");
		ts.add("orange");
		ts.add("grapes");
		System.out.println(ts);
		
		System.out.println(ts.size());
		System.out.println(ts.contains("apple"));
		ts.remove("apple");
		System.out.println(ts);
		System.out.println(ts.contains("apple"));
		//ts.clear();
		System.out.println(ts);
		
		for(String s: ts) {
			System.out.println(s);
		}
	}

}
