package mate.academy.lessons.lesson12.model;

import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class Human12 {
    private String name;
    private int age;
    private Car12 car12;

    public Human12(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human12(String name, int age, Car12 car12) {
        this.name = name;
        this.age = age;
        this.car12 = car12;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Car12> getCar12() {
        if (car12 == null) {
            return Optional.empty();
        } else {
            return Optional.of(car12);
        }

    }

    public void setCar12(Car12 car12) {
        this.car12 = car12;
    }

    @Override
    public String toString() {
        return "Human12{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car12=" + car12 +
                '}';
    }
}
