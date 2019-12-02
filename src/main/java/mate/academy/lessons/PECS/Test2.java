package mate.academy.lessons.PECS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        Human human = new Human("Bro");
        Human human2 = new Human("Ava");

        List<Human> list = new ArrayList<Human>();
        list.add(human);
        list.add(human2);

        List<Human> copyList = new ArrayList<>();
//        copyList.add(1);
//        copyList.add(2);
//        copyList.add(3);
//        copyList.add(4);
//        copyList.add(5);
        Collections.copy(copyList, list);
        System.out.println(copyList);
    }
}

class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{ " +
                "name = " + name;
    }
}