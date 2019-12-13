package mate.academy.lessons.lesson12;

import mate.academy.lessons.lesson12.dao.HumanDAO12;
import mate.academy.lessons.lesson12.model.Car12;
import mate.academy.lessons.lesson12.model.Human12;

import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {
        Human12 roma = new Human12("roma", 25);
        Human12 sergey = new Human12("sergey", 10);
        Human12 sergeyWithCar = new Human12("sergey", 10, new Car12("bmw", 250));

        HumanDAO12 humanDAO12 = new HumanDAO12();
        humanDAO12.add(roma);
        humanDAO12.add(sergey);
        humanDAO12.add(sergeyWithCar);

        Optional<Human12> human12 = humanDAO12.get(2);
        Optional<String> car12 = human12.get().getCar12().get().getModel() ;


        if (car12.isPresent()) {
            System.out.println(car12.get());
        } else {
            System.out.println("Нет машины");
        }
    }


}
