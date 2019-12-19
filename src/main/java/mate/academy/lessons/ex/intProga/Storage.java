package mate.academy.lessons.ex.intProga;

/**
 * @author Sergey Klunniy
 */
public class Storage implements AutoCloseable {
    {
        System.out.println("выполняем Storage");
    }

    @Override
    public void close() {
        System.out.println("Выполняем в Storage метод Close");
 //       throw new NoSuchElementException();
    }
}
