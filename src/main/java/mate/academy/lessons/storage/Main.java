package mate.academy.lessons.storage;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {
        Storage<Integer, String> house = new Storage<>();
        house.put(22, "German");
        house.put(31, "Sergei");
        house.put(2, "Sveta");

        if (house.get(22).isPresent()) {
            System.out.println(house.get(22).get());
        }else {
            System.out.println(house.get(22).orElse("Такого нет обьекта в БД"));
        }

        if (house.get(2).isPresent()) {
            System.out.println(house.get(2).get());
        }else {
            System.out.println(house.get(2).orElse("Такого нет обьекта в БД"));
        }

        if (house.get(90).isPresent()) {
            System.out.println(house.get(90).get());
        } else {
            System.out.println(house.get(90).orElse("Такого нет обьекта в БД"));
        }

        System.out.println(house);
    }
}
