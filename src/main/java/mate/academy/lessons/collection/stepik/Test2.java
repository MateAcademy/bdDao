package mate.academy.lessons.collection.stepik;

import java.util.Arrays;

/**
 * @author Sergey Klunniy
 */
public class Test2 {
    public static void main(String[] args) {
        int[] array = {23, 45, 55, 12};
        int newLength = array.length;

        int[] copiedArray = Arrays.copyOf(array, newLength);


        int[] copiedArray2 = Arrays.copyOfRange(array, 0,2);
        System.out.println(Arrays.toString(copiedArray2));
    }
}
