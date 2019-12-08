//package mate.academy.lessons.collection;
//
//import java.util.*;
///**
// * Задача о связке человека с его телефоном
// */
//public class Task3 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        TreeMap<String, TreeSet<String>> map = new TreeMap<>();
////в качестве ключа строка, а в качестве значения множество друзей
//
//        while (in.hasNextLine()) {
////            if (in.nextLine().length()==0) break;
//            String s = in.nextLine();
//            if(s.isEmpty()) break;
//            String[] ss = s.split(" ");
//            String name1 = ss[0];
//            String name2 = ss[1];
//
//            add(map, name1, name2);
//            add(map, name2, name1);
//        }
//
//
//        for (String name : map.keySet()) {
//            System.out.print(name + " дружит с : ");
//            for (String name2 : map.get(name)) {
//                System.out.print(name2 + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void add(TreeMap<String, TreeSet<String>> map, String name, String name2) {
//        if (map.containsKey(name)) {
//            map.get(name).add(name2);
//        } else {
//            TreeSet<String> treeSet = new TreeSet<>();
//            treeSet.add(name2);
//            map.put(name, treeSet);
//        }
//    }
//}
