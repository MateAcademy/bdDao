package mate.academy.lessons.collection.LL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class TT {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        add(linkedList);
        add(arrayList);
        add(linkedList);
        add(arrayList);
    }

    private static void add(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
