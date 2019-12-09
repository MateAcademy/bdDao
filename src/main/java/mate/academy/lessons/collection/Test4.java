package mate.academy.lessons.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list.add(null);
        list.add(null);
        list.add(null);
        list.add(5);

        System.out.println(list);
    }
}
