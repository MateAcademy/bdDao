package mate.academy.lessons.lesson1;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Collec {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();


        Random r = new Random();
        for (int i = 1; i < 12; i++) {
            int t = r.nextInt(100);
            hashSet.add(t);
            treeSet.add(t);
        }

        System.out.println(hashSet + " " + hashSet.size());
        System.out.println(treeSet + " " + treeSet.size());

        hashSet.clear();

        hashSet.add(12);hashSet.add(13);hashSet.add(14);hashSet.add(15);hashSet.add(16);hashSet.add(17);
        System.out.println(hashSet + " " + hashSet.size());
    }


}

