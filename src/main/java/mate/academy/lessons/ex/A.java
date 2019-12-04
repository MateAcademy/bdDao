package mate.academy.lessons.ex;

public abstract class A {
    void go(){
        System.out.println("A");
    }
}

class B extends A {
    void go() {
        System.out.println("B");
    }
}

class Main2 {
    public static void main(String[] args) {
        A a = new B();

    }

}