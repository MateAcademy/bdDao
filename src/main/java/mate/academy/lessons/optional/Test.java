package mate.academy.lessons.optional;

import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class Test {
    public static void main(String[] args) {
        Optional<String> str = Optional.ofNullable(null);
//        if (str.isPresent())
            System.out.println(str.get());


    }
}
