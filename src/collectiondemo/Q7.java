package collectiondemo;

import java.util.HashSet;

public class Q7 {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set.contains(20));
    }
}
