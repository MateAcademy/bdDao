package mate.academy.lessons.collection;

/**
 * Необходимо создать класс Stack. Для данного класса должны быть доступны следующие методы:
 * push(int value) - положить число на стек
 * pop() - вернуть вершину стека и извлечь элемент из стека, в случае извлечения максимума или минимума необходимо найти новые максимум и минимум
 * getMin() - возвращает минимум стека
 * getMax() - возвращает максимум стека
 * size() - возвращает длину стека
 * isEmpty() - проверяет стек на пустоту
 */
public class Stack {

    public int size;
    public int[] data;

    public Stack() {
        data = new int[0];
    }

    public void push(int value) {
        size++;
        int[] r = new int[data.length + 1];
        System.arraycopy(data, 0, r, 0, data.length);
        r[data.length] = value;
        data = r;
    }

    int pop() {
            int elem = data[data.length - 1];
            int[] r = new int[data.length - 1];
            System.arraycopy(data, 0, r, 0, data.length - 1);
            data = r;
            return elem;
    }

    int getMin() {
        int elem = 99999;
        for (int i = 0; i < data.length ; i++) {
            if (elem > data[i]) {
                elem=data[i];
            }
        }
        return elem;
    }

    int getMax() {
        int elem = -10000;
        for (int i = 0; i < data.length ; i++) {
            if (elem < data[i]) {
                elem=data[i];
            }
        }
        return elem;
    }

    int size() {
        return data.length;
    }

    boolean isEmpty() {
        if (data.length > 0) {
            return true;
        }
        return false;
    }

}
