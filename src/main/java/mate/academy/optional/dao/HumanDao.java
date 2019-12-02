package mate.academy.optional.dao;

import mate.academy.optional.model.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HumanDao {

    private static List<Human> humansStorage = new ArrayList<>();

    public void add(Human human) {
        humansStorage.add(human);
    }

    public Optional<Human> getOptional(int index) {
        if (index >=  humansStorage.size()) {
            return Optional.empty() ;
        }
        return Optional.of(humansStorage.get(index));
//        return Optional.ofNullable(humansStorage.get(index));
    }
}
