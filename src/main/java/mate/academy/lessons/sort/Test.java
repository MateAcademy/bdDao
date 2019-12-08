package mate.academy.lessons.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nl = scanner.nextLine();
        int n = Integer.parseInt(nl);

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String[] ss = s.split(" ");

            String name = ss[0];
            Integer mark = Integer.parseInt(ss[1]);
            students[i] = new Student(name, mark);
        }

//        Comparator<Student> comp = Comparator.comparing(Student::getMark).thenComparing(Student::getName);
//        Comparator<Student> comparator2 = Comparator.comparing(obj -> obj.getMark());

        Comparator<Student> comparator = (o1, o2) -> o2.getMark()-o1.getMark() ;
        comparator = comparator.thenComparing((o1, o2) -> o1.getName().compareTo(o2.getName()));


        Arrays.sort(students, comparator);

        for (Student s : students) {
            System.out.println( s.getName() + " " + s.getMark());
        }
    }

    static class Student {
        String name;
        int mark;

        public Student(String name, int mark) {
            this.name = name;
            this.mark = mark;
        }

        public String getName() {
            return name;
        }

        public int getMark() {
            return mark;
        }
    }
}
