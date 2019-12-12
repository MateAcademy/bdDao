package mate.academy.lessons.lesson10;

import java.util.Comparator;

/**
 * @author Sergey Klunniy
 */
public class HumanComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
            return o1.getAge()-o2.getAge();
    }
}
