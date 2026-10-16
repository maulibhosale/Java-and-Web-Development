package collectiondemo;

import java.util.LinkedList;

public class Q4 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        for (String s : list) {
            System.out.println(s);
        }
    }
}