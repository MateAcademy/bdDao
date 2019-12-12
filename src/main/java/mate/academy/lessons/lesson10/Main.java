package mate.academy.lessons.lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {
        short a = 22;
        int b = 100000;
        a = (short)b;
        System.out.println(a);


        Human sergey = new Human("Sergey", 30);
        Human.Hand рфтв = sergey.new Hand(20, 35);
        //вложенные классы, внутренний класс он создается от обьекта:

        Human.Car serLeg = new Human.Car();

        Human german = new Human("german", 80);
        Human igor = new Human("Igor", 22);
        Human andrey = new Human("Andrey", 17);


        List<Human> list = new ArrayList<>();
        list.add(igor);
        list.add(andrey);
        list.add(german);

        //для коллекшинс реализую Comparable
        Collections.sort(list);


        //для этого делаю класс с компаратором
        list.sort(new HumanComparator());


        System.out.println(list);

    }
}
