package mate.academy.lessons.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Sergey Klunniy
 */
public class Test2 {
    public static void main(String[] args) {
        Persone persone1 = new Persone("Sergey" , 20);
        Persone persone2 = new Persone("Sergey" , 20);

        Map<Persone, String> hashMap= new HashMap<>();
        hashMap.put(persone1, "hello");
        hashMap.put(persone2, "hello");

        for (Map.Entry ent : hashMap.entrySet()) {
            System.out.println(ent.getKey() + " : " + ent.getValue());
        }

    }

}

class Persone {
    private String name;
    private int age;

    public Persone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persone persone = (Persone) o;
        return age == persone.age &&
                Objects.equals(name, persone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}