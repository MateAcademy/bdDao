package mate.academy.lessons.lesson18;

import mate.academy.lessons.lesson18.impl.RenaultCarServiceImpl;

/**
 * @author Sergey Klunniy
 */
public class CarServiceStrategy {

    public static CarService getCarService(String vender) {
        switch (vender) {
            case "renault": return new RenaultCarServiceImpl();
            default: throw new RuntimeException("Unsupported vendor");
        }
    }
}
