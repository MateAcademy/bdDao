package mate.academy.lessons.lesson18;

/**
 * @author Sergey Klunniy
 */
public class Main {

    //@Injject
//    private static CarService carService = CarServiceStrategy.getCarService("renault");
    private static CarService carService;

    public static void main(String[] args) {
         Customs customs = new Customs(carService);
         customs.detailTechCheck();
    }
}
