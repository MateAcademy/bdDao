package mate.academy.lessons.sort.task25;

import java.util.Arrays;

/**
 * Спроектируйте параметризованный класс ParametrList
 *     с полями size, data
 *     и методами size(), add(value), get(index), set(index, value), remove(index), insert(index, value)
 *     find(value)
 */
public class ParametrList<T> {
    private Object[] data;
    private int size;


    public ParametrList() {
        size = 0;
        data = new Object[size];
    }

    public int size() {
        return size;
    }

    public void add (T value) {
        int sizeNew = ++size;
        Object[] data2 = new Object[sizeNew];
        if (data.length!=0)
        System.arraycopy(data, 0, data2, 0, data.length);
        data2[sizeNew-1] = value;
        data = data2;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public void set(int index, T value) {
        data[index]=value;
    }

    public void remove(int index) {
        Object[] data2 = new Object[--size];
        System.arraycopy(data, 0, data2, 0, index);
        System.arraycopy(data, index+1, data2, index, size-index);
        data = data2;
    }
    public void insert(int index, T value) {
        Object[] data2 = new Object[++size];
        System.arraycopy(data, 0, data2, 0, index);
        System.arraycopy(data, index, data2, index+1, size-index-1);
        data2[index] = value;
        data = data2;

    }

    public int find(T value) {
        try {
            for (int i = 0; i < size; i++) {
                if (data[i].equals(value))
                    return i;
            }
        } catch(Exception ex){
            return -1;
        }
          return -1;
        }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size; i++) {
            s.append(data[i]).append(" ");
        }
        return s.toString();
    }
}

class Test {
    public static void main(String[] args) {
        ParametrList<Integer> list = new ParametrList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        list.remove(2);

        list.insert(2, 30);
        System.out.println(list);
        System.out.println(list.size());
    }
}