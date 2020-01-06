package mate.academy.lessons.lesson17;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {

//        Operation operation = new Operation() {
//            @Override
//            public double getResalt(double value1, double value2) {
//                return value1 + value2;
//            }
//        };

        Operation operation = (value1, value2) -> value1 + value2;

        System.out.println(operation.getResalt(5.0, 5.0));


        Printer printer = new Printer() {
            @Override
            public void println(String str) {
                System.out.println(str + " !");
            }
        };

        printer.println("Hello");

        Printer printer1 = value -> {
            System.out.println(value);
            System.out.println(value);
        };


        printer1.println("y");
    }
}
