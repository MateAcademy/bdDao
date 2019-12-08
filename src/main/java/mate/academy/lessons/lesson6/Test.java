package mate.academy.lessons.lesson6;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        Random r = new Random();

        for (int i = 0; i < 12; i++) {
            int t = r.nextInt(100);
            hashSet.add(t);
            treeSet.add(t);
            System.out.print(t + " ");
        }

        System.out.println("\n" + hashSet + " " + hashSet.size());
        System.out.println(treeSet + " " + treeSet.size());


    }

}
