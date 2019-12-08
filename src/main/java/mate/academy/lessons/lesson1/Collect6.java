package mate.academy.lessons.lesson1;

import java.util.Scanner;
import java.util.TreeSet;

public class Collect6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();

        String[] s3 = s1.split(" ");
        String[] s4 = s2.split(" ");

        int a = Integer.parseInt(s3[0]);
        int a2 = Integer.parseInt(s3[1]);

        int[] a3 = new int[s4.length];
        for (int i = 0; i < a3.length; i++) {
            a3[i] = Integer.parseInt(s4[i]);
        }

        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < a3.length; i++) {
            set.add(a3[i]);
        }


        if (set.size() >= a2) {

            int k = 0;
            for (Integer s : set) {
                System.out.print(s + " ");
                k++;
                if (k == a2) System.exit(0);
            }

        } else {
            System.out.println(-1);
        }


    }
}
