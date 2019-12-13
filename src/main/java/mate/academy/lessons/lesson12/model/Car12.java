package mate.academy.lessons.lesson12.model;

import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class Car12 {
    private String model;
    private int speed;

    @Override
    public String toString() {
        return "Car12{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }

    public Optional<String> getModel() {
        if (model == null) {
            return Optional.empty();
        } else {
            return Optional.of(model);
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car12(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }
}
