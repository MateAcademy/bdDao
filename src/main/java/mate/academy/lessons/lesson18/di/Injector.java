package mate.academy.lessons.lesson18.di;

/**
 * @author Sergey Klunniy
 */
public class Injector {
    public static void main(String[] args) {
        Whils whils = new Whils();
        Car car = new Car(whils);
    }
}
