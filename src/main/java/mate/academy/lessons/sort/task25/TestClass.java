package mate.academy.lessons.sort.task25;

import java.util.Arrays;
import java.util.Random;

public class TestClass {
    public static void main(String[] args) {
        Value[] values = new Value[5];
        Random r = new Random();
        for (int i = 0; i < 5 ; i++) {
            values[i] = new Value(r.nextInt(10), r.nextInt(100));
        }

        System.out.print("До сортировки: "); System.out.println(Arrays.toString(values));
        Arrays.sort(values, ((o1, o2) -> o1.getW() - o2.getW()));
        System.out.print("После сортировки: "); System.out.println(Arrays.toString(values));
    }
}

class Value {
    private int w, p;

    public Value(int w, int p) {
        this.w = w;
        this.p = p;
    }

    public int getW() {
        return w;
    }

    public int getP() {
        return p;
    }

    @Override
    public String toString() {
        return "{" +
                "w= " + w +
                ", p= " + p +
                '}';
    }
}