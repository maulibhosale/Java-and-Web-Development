package collectiondemo;

import java.util.*;

public class ReplaceElement {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        colors.set(1, "Black");

        System.out.println(colors);
    }
}