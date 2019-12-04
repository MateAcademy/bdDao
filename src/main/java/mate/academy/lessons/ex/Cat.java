package mate.academy.lessons.ex;

public class Cat {
    private String name;
    private Integer age;
    private Integer weight;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, Integer age) {
        this(name);
        this.age = age;
    }

    public Cat(String name, Integer age, Integer weight) {
        this(name, age);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }


    public String toString2() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Myrzik");
        System.out.println(cat.toString2());
    }
}