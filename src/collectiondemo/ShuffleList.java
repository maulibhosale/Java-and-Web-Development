package collectiondemo;

import java.util.*;

public class ShuffleList {
	
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        Collections.shuffle(colors);

        System.out.println(colors);
    }
}
