package mate.academy.lessons.lesson5;

public class Serega<T> {
    private final T value;

    public Serega(T value) {
        this.value = value;
    }

    public static <T> Serega<T> of(T value) {
        return new Serega<>(value);
    }
}

class Main {

    public <T> Serega<T> add(T t) {
        return Serega.of(t);


    }
}