package mate.academy.lessons.collection.sort;

import java.util.*;

/**
 * @author Sergey Klunniy
 */
public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(54);
        list.add(57);
        list.add(40);
        list.add(30);
        list.add(100);

        Collections.sort(list, (o1, o2) -> {
            if(o1<o2) return 1;
            if(o1>o2) return -1;
            return 0;
        });
        System.out.println(list);
    }
}

//class ReverseList implements Comparator<Integer> {
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        if(o1<o2) return 1;
//        if(o1>o2) return -1;
//        return 0;
//    }
//}

class Persone {
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persone persone = (Persone) o;
        return id == persone.id &&
                Objects.equals(name, persone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Persone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Persone(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Test3 {
    public static void main(String[] args) {
        List<Persone> list = new ArrayList<>();
        list.add(new Persone(56, "Roma"));
        list.add(new Persone(6, "Guliya"));
        list.add(new Persone(1, "Bob"));
        list.add(new Persone(5, "Mike"));

        Collections.sort(list, new Comparator<Persone>() {
            @Override
            public int compare(Persone o1, Persone o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });


        System.out.println(list);
    }
}