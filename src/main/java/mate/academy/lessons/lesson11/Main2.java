package mate.academy.lessons.lesson11;

import mate.academy.lessons.lesson11.dao.HumanDao;
import mate.academy.lessons.lesson11.model.Human;

import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class Main2 {
    private final static HumanDao humanDao = new HumanDao();

    public static void main(String[] args) {

        Optional<Human> optHuman = humanDao.get(0);
        if (optHuman.isPresent()) {
            System.out.println(optHuman.get());
        }
//        if (human != null && human.getCar() != null && human.getCar().getModel() != null )
//            System.out.println(human.getCar().getModel());
    }

    static {
        humanDao.add(new Human("Sergey", 35));
    }
}
