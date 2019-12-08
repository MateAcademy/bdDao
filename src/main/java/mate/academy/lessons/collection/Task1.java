package mate.academy.lessons.collection;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Задача на множество, сборки алфавита строки
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = string.toLowerCase();

        TreeSet<Character> treeSet = new TreeSet<>();

        for (int i=0; i < string.length(); i++) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                treeSet.add(string.charAt(i));
            }
        }

//        System.out.println(treeSet);
        for (Character character : treeSet) {
            System.out.print(character + " ");
        }
    }
}
