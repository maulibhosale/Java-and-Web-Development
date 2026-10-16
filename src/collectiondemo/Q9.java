package collectiondemo;

import java.util.TreeSet;

public class Q9 {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);

        set.remove(30);

        System.out.println(set);
    }
}
