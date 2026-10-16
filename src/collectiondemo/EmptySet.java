package collectiondemo;

import java.util.*;

public class EmptySet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        try {
            if (set.isEmpty()) {
                throw new Exception("Set is empty");
            }

            System.out.println(set);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}