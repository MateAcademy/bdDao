package mate.academy.lessons.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class ClientTest {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Sergey", 80));
        empList.add(new Employee("Sergey", 5));
        empList.add(new Employee("Sergey", 20));
        empList.add(new Employee("Sergey", 1));
        empList.add(new Employee("Andrey", 25));
        empList.add(new Employee("Zooly", 46));

        System.out.println("Before sorting...");
        empList.forEach(System.out::println);

        Comparator<Employee> comp = Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);
        Collections.sort(empList, comp);

        System.out.println("After sortting...");
        empList.forEach(System.out::println);
    }
}
