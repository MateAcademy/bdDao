package mate.academy.lessons.myARRList;

import java.util.Arrays;

public class FR {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{1,2,3,4,5,6,7};
        Integer[] arr2 = new Integer[]{0,0,0,0,0,0,0};
        System.arraycopy(arr1,1, arr2, 0, 3);
        System.out.println(Arrays.toString(arr2));
        System.arraycopy(arr1, 1, arr2, 4, 3);
        System.out.println(Arrays.toString(arr2));
    }
}
