package mate.academy.optional;

import mate.academy.optional.dao.HumanDao;
import mate.academy.optional.model.Human;

import java.util.Optional;

public class Main {
    private static final HumanDao humanDao = new HumanDao();

    public static void main(String[] args) {
        Optional<Human> optHuman = humanDao.get(0);

        if (optHuman.isPresent()) {
            System.out.println(optHuman.get().getName()  );
        }

//        if (human != null && human.getCar() != null && human.getCar().getModel() != null) {
//            System.out.println(human.getCar().getModel());
//        }


    }


    static {
        humanDao.add(new Human(12, "German"));
    }
}
