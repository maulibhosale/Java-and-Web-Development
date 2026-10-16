package collectiondemo;

import java.util.HashMap;

public class Q11 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("India", "New Delhi");
        map.put("USA", "Washington DC");
        map.put("Japan", "Tokyo");

        System.out.println(map.get("India"));
    }
}
