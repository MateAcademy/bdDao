//package mate.academy.lessons.LL;
//
//import mate.academy.lessons.collection.Task3;
//
//import java.util.HashMap;
//import java.util.Scanner;
//import java.util.TreeMap;
//import java.util.TreeSet;
//
///**
// * Задача: мы хотим узнать алфавит нашей строки в нижнем регистре  и сколько каждая буква встречается в строке
// */
//public class Collect5 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        s = s.toLowerCase();
//
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
//                if (hashMap.get(s.charAt(i)) != null) {
//                    hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
//                } else {
//                    hashMap.put(s.charAt(i), 1);
//                }
//            }
//        }
//
//        System.out.println(hashMap);
//
//    }
//}
//
//
//class AB {
//    public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        TreeMap<Character, Integer> map = new TreeMap<>();
////        String s = in.nextLine();
////        s = s.toLowerCase();
////        for (int i = 0; i < s.length(); i++) {
////            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
////                if (map.containsKey(s.charAt(i)))
////                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
////                else
////                    map.put(s.charAt(i), 1);
////            }
////        }
////
////        for (Character ch : map.keySet()) {
////            System.out.println(ch + " : " + map.get(ch));
////        }
//
//
//    }
//}
//
//class ABC {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
////TODO: в качестве ключа строка а в качестве значения множество телефонных номеров
//        TreeMap<String, TreeSet<String>> map= new TreeMap<>();
//        for (int i = 0; i < 4; i++) {
//            String s = in.nextLine();
//            String[] ss = s.split(" ");
//            String name = ss[0] + ss[1];
//            String number = ss[2];
//            Task3.go(map, name, number);
//        }
//
//        for (String name : map.keySet()) {
//            System.out.println(name + " : " );
//            for (String number : map.get(name)) {
//                System.out.print(number + " ");
//            }
//            System.out.println();
//        }
//
//
//
//
//
//
//
//
//    }
//}