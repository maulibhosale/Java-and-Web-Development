package collectiondemo;

import java.util.*;

public class DuplicateNumbers {
    
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Enter 5 numbers:");

        try {
            for (int i = 0; i < 5; i++) {
                int num = sc.nextInt();

                if (!set.add(num)) {
                    throw new Exception("Duplicate number found: " + num);
                }

                list.add(num);
            }

            System.out.println(list);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }
}
