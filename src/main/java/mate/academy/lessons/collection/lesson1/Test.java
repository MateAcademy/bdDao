package mate.academy.lessons.collection.lesson1;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class Test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 21; i++) {
            list.add(i);
        }

        System.out.println(list);

        list = new LinkedList<>(list);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);

        System.out.println(list);

    }
}