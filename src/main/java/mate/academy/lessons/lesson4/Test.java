package mate.academy.lessons.lesson4;


interface AbleToEate {
    public void eat();
}


public class Test {
    public static void main(String[] args) {

        ((AbleToEate) () -> System.out.println("Animal to ete...")).eat();
    }
}
