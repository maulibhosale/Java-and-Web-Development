package collectiondemo;

import java.util.LinkedList;

public class Q5 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        list.addFirst("Kotlin");
        list.addLast("Swift");

        System.out.println(list);
    }
}
