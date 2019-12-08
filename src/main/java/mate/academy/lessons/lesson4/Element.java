package mate.academy.lessons.lesson4;

import java.io.OutputStream;
import java.util.*;

public class Element {
    public static void main(String[] args) {
        Random r = new Random();
        Set<Integer> listLinkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> hashSet = new HashSet<>();


        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            Integer number = r.nextInt(100);
            arr[i] = number;

            listLinkedHashSet.add(number);
            treeSet.add(number);
            hashSet.add(number);
        }

        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("listLinkedHashSet : " + listLinkedHashSet);
        System.out.println("treeSet : " + treeSet);
        System.out.println("hashSet : " + hashSet);


    }
}
