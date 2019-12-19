package mate.academy.lessons.ex;

/**
 * @author Sergey Klunniy
 */
public interface Fly {
    int age = 4;

    void fly();

    default void time() {
        System.out.println("time");
    }

}
