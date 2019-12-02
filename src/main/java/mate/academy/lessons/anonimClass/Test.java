package mate.academy.lessons.anonimClass;

class Animal {
    public void eat () {
        System.out.println("Animal s eating...");
    }
}


class OtherAnimal extends Animal {
    @Override
    public void eat() {
        System.out.println("Other Animal s eating...");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        OtherAnimal otherAnimal = new OtherAnimal();
        otherAnimal.eat();
    }

}
