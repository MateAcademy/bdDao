package mate.academy.lessons.lesson18.impl;

import mate.academy.lessons.lesson18.CarService;

/**
 * @author Sergey Klunniy
 */
@Service
public class BWMCarServiceImpl implements CarService {

    @Override
    public void techCheck() {
        System.out.println("I am BMW");
    }
}
