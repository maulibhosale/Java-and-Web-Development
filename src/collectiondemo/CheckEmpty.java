package collectiondemo;

import java.util.*;

public class CheckEmpty {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        System.out.println(colors.isEmpty());

        colors.add("Red");

        System.out.println(colors.isEmpty());
    }
}