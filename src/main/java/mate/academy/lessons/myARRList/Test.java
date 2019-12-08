package mate.academy.lessons.myARRList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Integer[] arr = {5, 6, 7, 8};
        List<Integer> arrCopy = Arrays.asList(arr);

        System.out.println(arrCopy);

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, arr);
        System.out.println(list);


    }
}
