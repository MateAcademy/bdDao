package mate.academy.lessons.lesson12.dao;

import mate.academy.lessons.lesson12.model.Human12;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class HumanDAO12 {
    private static final List<Human12> humanSorage = new ArrayList<>();

    public static void add(Human12 human) {
        humanSorage.add(human);
    }


    public static Optional<Human12> get(int id) {
        if (id >= humanSorage.size()) {
            return Optional.empty();
        }
        return Optional.of(humanSorage.get(id));
    }
}
