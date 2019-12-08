package mate.academy.lessons.collection;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Задача собирать буквы в строке и их количество:
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.toLowerCase();

        TreeMap<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {

                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i))+ 1);
                } else {
                    map.put(s.charAt(i), 1);
                }
            }
        }

        for (Character ch : map.keySet()) {
            System.out.print(ch + " : " + map.get(ch)+ "\n" );
        }




    }
}
