package mate.academy.optional;

import mate.academy.optional.dao.HumanDao;
import mate.academy.optional.model.Human;

import java.util.Optional;

public class Main {
    private static final HumanDao humanDao = new HumanDao();

    public static void main(String[] args) {
        Optional<Human> optHuman = humanDao.getOptional(0);

 //       optHuman.orElse();


        if (optHuman.isPresent()) {
            System.out.println(optHuman.get().getName()  );
        }
        optHuman.ifPresent(human -> System.out.println(human.getName()));
    }

    static {
        humanDao.add(new Human(12, "German"));
    }
}
