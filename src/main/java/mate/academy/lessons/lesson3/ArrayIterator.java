package mate.academy.lessons.lesson3;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {

    private int index = 0;
    E[] value;

    ArrayIterator(E[] value) {
        this.value = value;
    }


    @Override
    public boolean hasNext() {
        return index < value.length;
    }

    @Override
    public E next() {
        return value[index++];
    }
}
