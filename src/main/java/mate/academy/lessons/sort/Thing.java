package mate.academy.lessons.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Thing {
    int w, p;

    public Thing(int w, int p) {
        this.w = w;
        this.p = p;
    }

    @Override
    public String toString() {
        return "{" +
                "w= " + w +
                ", p= " + p +
                '}';
    }
}
class Main {
    public static void main(String[] args) {
        Thing[] things = new Thing[5];
        Random r = new Random();
        for (int i = 0; i <5 ; i++) {
            Thing thing = new Thing(r.nextInt(10), r.nextInt(100));
            things[i] = thing;
        }

        System.out.println(Arrays.toString(things));

        Arrays.sort(things, Comparator.comparingInt(o -> o.w));
        for (Thing thing : things) {
            System.out.println(thing.w + " " + thing.p);
        }
    }


}