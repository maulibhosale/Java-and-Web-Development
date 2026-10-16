package collectiondemo;

import java.util.*;

public class SearchElement {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        if (colors.contains("Blue")) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}