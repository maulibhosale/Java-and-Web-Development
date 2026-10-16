package collectiondemo;

import java.util.*;

public class Demo9 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(45);
		al.add(23);
		al.add(77);
		al.add(98);
		al.add(45);
		System.out.println(al);
		
		ArrayList<Integer>al1=new ArrayList<Integer>();
		al1.add(55);
		al1.add(94);
		al1.add(65);
		al1.add(98);
		System.out.println(al1);
		
		HashSet<Integer>hs = new HashSet<Integer> ();
		hs.add(98);
		hs.add(12);
		hs.add(20);
		System.out.println(hs);
		
		hs.addAll(al);
		System.out.println(hs);
		
		al.addAll(al1);
		System.out.println(al);
		
		//al.retainAll(al1);
		//System.out.println(al);
		
		al.removeAll(al1);
		System.out.println(al);
	}

}
