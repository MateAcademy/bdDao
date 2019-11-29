package mate.academy.lessons.lesson1;

import java.util.ArrayList;
import java.util.TreeSet;

public class Collec2 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        ArrayList<String> arr = new ArrayList<>();
        arr.add("12");
        arr.add("33333");
        arr.add("7");
        arr.add("BBB");



        set.addAll(arr);

        for (String i : set) {
            System.out.print(i + " ");
        }
    }
}
