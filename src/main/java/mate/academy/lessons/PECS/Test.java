package mate.academy.lessons.PECS;

public class Test {
    public static void main(String[] args) {
        Container<? extends Planner> container = new Container<Boeing>();
        container.getValue().plan();
//        container.setValue(new Aircraft());
//        container.setValue(new Planner());
//        container.setValue(new Boeing());
//        container.setValue(new Cesna());
//
//        Container<Planner> cesnaContainer =new Container<Boeing>();

    }
}

class Container<T> {
    T value;
    public T getValue() { return value; }
    public void setValue(T value) { this.value = value; }
}

class Aircraft { }  //Воздушное судно

class Planner extends Aircraft {
    void plan(){
        System.out.println("plan");
    }
}

class Boeing extends Planner {}

class Cesna extends Planner {}