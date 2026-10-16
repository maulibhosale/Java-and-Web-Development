package collectiondemo;

import java.util.*;

public class Iterate {
	
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
