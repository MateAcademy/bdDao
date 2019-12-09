package mate.academy.lessons.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class Tset {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("frog");
        animals.add("a");
        animals.add("b");
        animals.add("ba");
        animals.add("ab");
        animals.add("Helloworld");

        Collections.sort(animals);
        Collections.sort(animals, new StringLangthComparator());
        System.out.println(animals);

    }
}

class StringLangthComparator implements Comparator<String> {//реализовываем интерфейс Comparator

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        }else {
            return 0;
        }

    }
}