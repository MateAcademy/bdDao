package mate.academy.lessons.lesson11.dao;

import mate.academy.lessons.lesson11.model.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class HumanDao {

    private static List<Human> humanSorage = new ArrayList<>();

    public void add(Human human) {
        humanSorage.add(human);
    }

    public Optional<Human> get(int index) {
        if (index >=  humanSorage.size()){
            return Optional.empty();
        }
       return Optional.of(humanSorage.get(index));
    }
}
