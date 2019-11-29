package mate.academy.lessons.lesson1;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collect3 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int number = r.nextInt(50);
            hashSet.add(number);
            treeSet.add(number);
        }

        System.out.println(hashSet + " " + hashSet.size());
        System.out.println(treeSet + " " + treeSet.size());
    }
}
