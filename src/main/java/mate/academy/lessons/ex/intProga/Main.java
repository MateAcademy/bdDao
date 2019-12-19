package mate.academy.lessons.ex.intProga;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) throws Exception {
        test();
    }

    private static void test() {

        try (Storage storage = new Storage()) {
            System.out.println("Выполняем try");
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Выполняем catch");
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
