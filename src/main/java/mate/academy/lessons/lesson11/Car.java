package mate.academy.lessons.lesson11;

/**
 * @author Sergey Klunniy
 */
public class Car {

    private String model;
    private String color;
    private int weight;
    private int spead;

    private Car(Builder builder) {
        this.weight = builder.weight;
        this.model = builder.model;
        this.color = builder.color;
        this.spead = builder.spead;
    }

    static class Builder {
        private String model;
        private String color;
        private int weight;
        private int spead;

        public Builder(String model) {
            this.model = model;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder setSpead(int spead) {
            this.spead = spead;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", spead=" + spead +
                '}';
    }
}
