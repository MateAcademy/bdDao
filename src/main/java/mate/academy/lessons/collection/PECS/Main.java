//package mate.academy.lessons.collection.PECS;
//
//import java.util.List;
//
///**
// * @author Sergey Klunniy
// * принцип PECS
// */
//public class Main {
//    public static void main(String[] args) {
//
//        Container<? super Planner> container = new Container<Aircraft>();
//        Container<? super Planner> container2 = new Container<Planner>();
//        container.setValue(new Aircraft());
//        container.setValue(new Planner());
//        container.setValue(new Boeing());
//        container.setValue(new Cesna());
//
//        Container<? extends Planner> container3 = new Container<Planner>();
//        Container<? extends Planner> container5 = new Container<Boeing>();
//        container3.setValue(new Aircraft());
//        container3.setValue(new Planner());
//        container3.setValue(new Boeing());
//        container3.setValue(new Cesna());
//    }
//
//    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
//    }
//}
//
//class Container<T> {
//    T value;
//
//    public T getValue() {
//        return value;
//    }
//
//    public void setValue(T value) {
//        this.value = value;
//    }
//}
//
//
//class Aircraft {
//} // самолет, воздушное судно
//
//class Planner extends Aircraft {  // планировщик, самолет без двигателя
//}
//
//class Boeing extends Aircraft {
//}
//
//class Cesna extends Aircraft {
//}
