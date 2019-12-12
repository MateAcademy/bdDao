package mate.academy.lessons.lesson11;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder("bmw").setColor("read").setWeight(1000).build();

        Car.Builder carBuilder = new Car.Builder("bmv").setColor("read").setWeight(100);

        Car yurka = carBuilder.setSpead(500).build();
        Car my = carBuilder.setSpead(350).build();


        print(yurka);
        print(my);
    }

    public static void print(Car car) {
        System.out.println(car);
    }
}
