package mate.academy.lessons.lesson1;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Задача: сборка алфавита строки
 */
public class Collect4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<Character> treeSet = new TreeSet<>();
        String s = in.nextLine();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='a' && s.charAt(i)<='z')
                treeSet.add(s.charAt(i));
        }

        System.out.println(treeSet);

        for (Character t : treeSet) {
            System.out.print(t + " ");
        }
    }
}

class A {
    public static void main(String[] args) {
        TreeSet<Character> treeSet = new TreeSet<>();
        treeSet.add('a');
        treeSet.add('b');
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        treeSet.add(str.charAt(0));

        System.out.println(treeSet);

    }
}