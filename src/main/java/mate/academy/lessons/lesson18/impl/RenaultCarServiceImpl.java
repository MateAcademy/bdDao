package mate.academy.lessons.lesson18.impl;

import mate.academy.lessons.lesson18.CarService;

/**
 * @author Sergey Klunniy
 */
public class RenaultCarServiceImpl implements CarService {
    @Override
    public void techCheck() {
        System.out.println("I am renault");
    }
}
