package mate.academy.lessons.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("aaa");
        list.add("DDD");

        List<String> list1 = new ArrayList<>();
        list1.add("aaa");

        list.retainAll(list1);

        for (String s : list) {
            System.out.println(s);
        }


    }
}
