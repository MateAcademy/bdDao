package mate.academy.lessons.lesson4;


import java.lang.reflect.Array;
import java.util.*;

interface AbleToEate {
    public void eat();
}


public class Test {
    public static void main(String[] args) {

        ((AbleToEate) () -> System.out.println("Animal to ete...")).eat();
    }
}

class Test2 {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 7, 8};
        List<Integer> list = Arrays.asList(arr);

        //System.out.println(list);

        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(Integer[] coll) {
        coll[0] = 999;
        Set<Integer> set = new HashSet<>();
        Collections.addAll(set , coll);
        System.out.println(set);
    }
}