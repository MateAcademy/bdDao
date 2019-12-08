package mate.academy.lessons.myARRList;

import java.util.Arrays;

class Array {
    public int size;
    public int[] data;

    public Array() {
        data = new int[0];
    }

    public void add(int element){
        size++;
                int[] r = new int[data.length+1];
                System.arraycopy(data, 0, r, 0, data.length);
                r[data.length] = element;
                data=r;
    }
}

class Main {
    public static void main(String[] args) {


        Array ar = new Array();
        for (int i = 1; i < 10; i++) {
            ar.add(i);
        }

        System.out.println(Arrays.toString(ar.data));
        System.out.println(ar.size);
    }
}