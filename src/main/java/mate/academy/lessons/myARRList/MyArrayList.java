package mate.academy.lessons.myARRList;

import java.util.Iterator;

interface MyList<T> {
    boolean add(T t);
    T get(int index);
}

public class MyArrayList<T> implements MyList<T>  {
    private static Object[] arr;



    public MyArrayList() {
        arr = new Object[5];
    }


    public void setArr(T[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean add(T t) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = t;
                return true;
            }
            if (i == arr.length - 1) {
                Object[] r = new Object[arr.length*2];
                System.arraycopy(arr, 0, r, 0, arr.length);
                r[arr.length] = t;
                arr=r;
                return true;
            }
        }
        return false;
    }

    @Override
    public T get(int index) {
        Object o = null;
        for (int i = 0; i < arr.length; i++) {
             o = arr[index];
        }
        return (T)o;
    }

    @Override
    public String toString() {
        for (Object r : arr) {
            System.out.print(r + " ");
        }
        return "";
    }
}

class A {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);


        System.out.println(myArrayList);


//        MyList<String> myList = new MyArrayList<>();
//        myList.add("Sergey");
//
//        System.out.println(myList);
//        System.out.println(myList.get(1));


//        Iterator iterator = myArrayList.i
//
//        for (Integer i : myArrayList) {
//            System.out.print(myArrayList.next() + " ");
//        }


    }
}