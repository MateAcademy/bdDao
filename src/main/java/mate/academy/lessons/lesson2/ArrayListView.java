package mate.academy.lessons.lesson2;


//interface List<T> {
//    void add(T value);
//    void add(T value, int index);
//    void addAll(List<T> list);
//    T get(int index);
//    void set(T value, int index);
//    T remove(int index);
//    T remove(T t);
//    int size();
//    boolean isEmpty();
//}


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListView {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        string.add("abc");
        string.add("Hello");
        string.add("ttt");

//        System.out.println(string);


//        Iterator<String> it = string.iterator();
//        while (it.hasNext()) {
//            System.out.print(it.next() + " ");
//        }
//        System.out.println();

        for (String s : string) {
            System.out.print(s + " ");
        }


        System.out.println("\n" + string.get(1));
//        System.out.println(string.size());
//        System.out.println(string.remove(1));

        string.set(2, "Y");

        for (String s : string) {
            System.out.print(s + " ");
        }


    }
}
