package mate.academy.lessons.collection.stepik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class Test1 {
    public static void main(String[] args) {

            List<String> list = Arrays.asList("hi hello goodmorning ass".split("\\s"));
            changeList(list).stream().forEach(System.out::println);
        }



        static List<String> changeList(List<String> list) {

            List<String> list2 = new ArrayList<>();
        String max = Collections.max(list, (o1, o2) -> {
            if (o1.length()<o2.length()) return -1;
            if (o1.length()>o2.length()) return 1;
            return 0;
        });

            for (int i = 0; i < list.size(); i++) {
                list2.add(max);
            }
            return list2;
        }


    }