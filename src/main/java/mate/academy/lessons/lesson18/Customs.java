package mate.academy.lessons.lesson18;

/**
 * @author Sergey Klunniy
 */
public class Customs {

    private CarService carService;

    public Customs(CarService carService) {
        this.carService = carService;
    }

    public void detailTechCheck() {
        carService.techCheck();
    }
}
