package mate.academy.lessons.lesson17;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {

        Factorial factorial = new Factorial() {
            @Override
            public int getResult(int value) {
               int count = 1;

                for (int i = 1; i <= value; i++) {
                    count = count*i;
                }

                return count;
            }
        };

        System.out.println(factorial.getResult(5));

    }
}
