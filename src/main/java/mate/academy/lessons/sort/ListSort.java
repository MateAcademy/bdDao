package mate.academy.lessons.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Klunniy Sergey 05.12.2019
 */
public class ListSort {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("horse");
        animals.add("bird");
        animals.add("crocodile");

        System.out.println("Before sort : " + animals);
        Collections.sort(animals);
        System.out.println("After sort : " + animals);


    }
}
