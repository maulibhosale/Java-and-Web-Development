package collectiondemo;

import java.util.*;

public class Demo8 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(45);
		al.add(23);
		al.add(77);
		al.add(98);
		al.add(45);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains(45));
		al.remove(0);
		System.out.println(al);
		
		al.add(0,100);
		System.out.println(al);
		al.add(1, 99);
		System.out.println(al);
		System.out.println(al.get(3));
		
		Collections.reverse(al);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.reverseOrder();
		System.out.println(al);
		
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		
		Collections.shuffle(al);
		System.out.println(al);
	}

}
