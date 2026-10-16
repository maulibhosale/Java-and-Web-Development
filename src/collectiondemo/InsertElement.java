package collectiondemo;

import java.util.*;

public class InsertElement {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        colors.add(0, "Red");

        System.out.println(colors);
    }
}