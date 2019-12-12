package mate.academy.lessons.lesson10;

/**
 * @author Sergey Klunniy
 */
public class Human implements Comparable<Human>{
    private String name;
    private int age;


    @Override
    public int compareTo(Human o) {
        return this.getAge()- o.age ;
    }



    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    static class Car {

    }

    class Hand {
        private int height;
        private int weight;

        public Hand(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Hand{" +
                    "height=" + height +
                    ", weight=" + weight +
                    '}';
        }
    }


}
